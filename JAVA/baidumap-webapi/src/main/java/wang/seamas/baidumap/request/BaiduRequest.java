package wang.seamas.baidumap.request;

import wang.seamas.baidumap.exception.NullOrEmptyException;
import wang.seamas.baidumap.request.model.BaiduModel;
import wang.seamas.baidumap.response.BaiduResponse;
import wang.seamas.baidumap.util.MapUtil;

import java.util.Map;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:23 2018/8/1
 */
public abstract class BaiduRequest<T extends BaiduResponse, S extends BaiduModel> implements IBaiduRequest<T> {

    protected final S model;
    protected String host;
    protected String address;
    protected Boolean requiredTimestamp;

    public BaiduRequest(S model) {
        this.model = model;
        this.host = "http://api.map.baidu.com";
        this.requiredTimestamp = false;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Map<String, String> getParameters() {

        try {
            return MapUtil.getFieldsMap(model);
        } catch (NullOrEmptyException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean getRequiredTimestamp() {
        return requiredTimestamp;
    }

}
