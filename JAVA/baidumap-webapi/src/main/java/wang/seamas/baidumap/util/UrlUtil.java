package wang.seamas.baidumap.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 13:06 2018/8/1
 */
public class UrlUtil {

    private static final List<String> exceptList = Arrays.asList(",");

    public static String buildQuery(Map<String, String> map) {
        List<String> list = map.entrySet()
                .stream()
                .map(item -> item.getKey() + "=" + item.getValue())
                .collect(Collectors.toList());

        return String.join("&", list);
    }

    public static String buildEncodeQuery(Map<String, String> map) {
        List<String> list = new ArrayList<>();

        for(Map.Entry<String, String> item: map.entrySet()) {
            list.add(item.getKey() + "=" + encodeParam(item.getValue()));
        }

        return String.join("&", list);
    }

    private static String encodeParam(String plainText) {
        String result = "";
        try {
            result = URLEncoder.encode(plainText, "UTF-8");
            for (String value : exceptList) {
                result = result.replace(URLEncoder.encode(value, "UTF-8"), value);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String MD5(String plainText) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("md5");
            byte[] array = md.digest(plainText.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
