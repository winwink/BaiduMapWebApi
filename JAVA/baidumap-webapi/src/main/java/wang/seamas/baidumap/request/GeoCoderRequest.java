package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.GeoCoderModel;
import wang.seamas.baidumap.response.GeoCoderResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:03 2018/8/6
 */
public class GeoCoderRequest extends BaiduRequest<GeoCoderResponse, GeoCoderModel> {

    public GeoCoderRequest(GeoCoderModel model) {
        super(model);
        this.address = "/geocoder/v2/";
    }
}
