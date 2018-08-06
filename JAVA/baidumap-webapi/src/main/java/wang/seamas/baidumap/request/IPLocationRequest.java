package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.IPModel;
import wang.seamas.baidumap.response.IPLocationResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:05 2018/8/6
 */
public class IPLocationRequest extends BaiduRequest<IPLocationResponse, IPModel> {

    public IPLocationRequest(IPModel model) {
        super(model);
        this.address = "/location/ip";
    }
}
