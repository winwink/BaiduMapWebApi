package wang.seamas.baidumap;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import wang.seamas.baidumap.request.IBaiduRequest;
import wang.seamas.baidumap.response.BaiduResponse;
import wang.seamas.baidumap.util.StringUtil;
import wang.seamas.baidumap.util.UrlUtil;
import wang.seamas.reflect.ClassTreeUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 12:56 2018/8/1
 */
public class BaiduApiClient {

    private final ObjectMapper mapper = new ObjectMapper();
    private final String ak;
    private final String sk;

    public BaiduApiClient(String ak) {
        this(ak, "");
    }

    public BaiduApiClient(String ak, String sk) {
        this.ak = ak;
        this.sk = sk;
        // 忽略java类中未定义的字段
        //this.mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public <T extends BaiduResponse> T execute(IBaiduRequest<T> request) {
        String queryString = buildQueryString(request);
        String responseString = null;
        try {
            responseString = getResponseString(request.getHost(), request.getAddress(), queryString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Class<T> clazz = (Class<T>)ClassTreeUtil.findGenericParameterType(request.getClass(), IBaiduRequest.class, 0);
        T result = null;
        try {
            result = mapper.readValue(responseString, clazz);            
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMeta(responseString);
        return result;
    }

    public <T extends BaiduResponse> String executeReadString(IBaiduRequest<T> request) throws IOException {
        String queryString = buildQueryString(request);
        return getResponseString(request.getHost(), request.getAddress(), queryString);
    }


    /**
     * 获取返回数据
     * @param host
     * @param address
     * @param queryString
     * @return
     * @throws IOException
     */
    private String getResponseString(String host, String address, String queryString) throws IOException {
        String url = host + address + "?" + queryString;
        HttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        InputStream stream = response.getEntity().getContent();
        return IOUtils.toString(stream, StandardCharsets.UTF_8);
    }


    /**
     * 调用参数
     * @param request
     * @param <T>
     * @return
     */
    private <T extends BaiduResponse> String buildQueryString(IBaiduRequest<T> request) {
        return StringUtil.isNullOrEmpty(sk) ? buildAkQueryString(request) : buildSnQueryString(request);
    }

    /**
     * AK调用参数
     * @param request
     * @param <T>
     * @return
     */
    private <T extends BaiduResponse> String buildAkQueryString(IBaiduRequest<T> request) {
        Map<String, String> map = request.getParameters();
        map.put(akName, ak);
        return UrlUtil.buildQuery(map);
    }

    /**
     * SN调用参数
     * @param request
     * @param <T>
     * @return
     */
    private <T extends BaiduResponse> String buildSnQueryString(IBaiduRequest<T> request) {
        Map<String, String> map = request.getParameters();

        if (request.getRequiredTimestamp()) {
            if (!map.containsKey(timeStampName)) {
                map.put(timeStampName, String.valueOf(System.currentTimeMillis()/1000));
            }
        }

        String sn = null;
        try {
            sn = calculateSN(map, request.getAddress());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        map.put(snName, sn);
        return UrlUtil.buildQuery(map);
    }


    /**
     * 计算SN
     * @param parameters
     * @param url
     * @return
     * @throws UnsupportedEncodingException
     */
    private String calculateSN(Map<String, String> parameters, String url) throws UnsupportedEncodingException {
        if (parameters.containsKey(akName)) {
            parameters.remove(akName);
        }
        parameters.put(akName, ak);

        if (parameters.containsKey(snName)) {
            parameters.remove(snName);
        }

        String queryString = UrlUtil.buildEncodeQuery(parameters);
        String encode = URLEncoder.encode(url + "?" + queryString + sk, "UTF-8");
        return UrlUtil.MD5(encode);
    }

    private static final String akName = "ak";
    private static final String snName = "sn";
    private static final String timeStampName = "timestamp";
}
