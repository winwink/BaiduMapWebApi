package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.PlaceModel;
import wang.seamas.baidumap.response.PlaceSearchResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:56 2018/8/3
 */
public class PlaceSearchRequest<T extends PlaceModel> extends BaiduRequest<PlaceSearchResponse, T> {

    public PlaceSearchRequest(T model) {
        super(model);
        this.address = "/place/v2/search";
    }
}
