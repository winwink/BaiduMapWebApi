package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.PlaceDetailModel;
import wang.seamas.baidumap.response.PlaceDetailResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:07 2018/8/6
 */
public class PlaceDetailRequest extends BaiduRequest<PlaceDetailResponse, PlaceDetailModel> {
    public PlaceDetailRequest(PlaceDetailModel model) {
        super(model);
        this.address = "/place/v2/detail";
    }
}
