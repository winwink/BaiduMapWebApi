package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.util.UrlUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:11 2018/8/6
 */
public class BasicEncodeTest {

    @Test
    public void test() throws UnsupportedEncodingException {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("address", "百度大厦");
        map.put("output", "json");
        map.put("ak", "yourak");

        String queryString = UrlUtil.buildEncodeQuery(map);
        Assert.assertEquals(queryString, "address=%E7%99%BE%E5%BA%A6%E5%A4%A7%E5%8E%A6&output=json&ak=yourak");

        String url = "/geocoder/v2/?" + queryString + "yoursk";
        String tmp = URLEncoder.encode(url, "UTF-8");
        String md5 = UrlUtil.MD5(tmp);
        Assert.assertEquals(md5, "7de5a22212ffaa9e326444c75a58f9a0");
    }
}
