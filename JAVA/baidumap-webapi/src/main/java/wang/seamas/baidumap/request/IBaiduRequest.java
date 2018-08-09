package wang.seamas.baidumap.request;

import wang.seamas.baidumap.response.BaiduResponse;

import java.util.Map;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:58 2018/8/1
 */
public interface IBaiduRequest<T extends BaiduResponse>  {
    String getHost();
    String getAddress();
    Map<String, String> getParameters();
    Boolean getRequiredTimestamp();
}


