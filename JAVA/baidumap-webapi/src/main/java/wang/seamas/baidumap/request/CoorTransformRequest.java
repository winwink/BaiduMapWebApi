package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.CoordTransfModel;
import wang.seamas.baidumap.response.CoordTransformResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 12:32 2018/8/6
 */
public class CoorTransformRequest extends BaiduRequest<CoordTransformResponse, CoordTransfModel> {
    public CoorTransformRequest(CoordTransfModel model) {
        super(model);
        this.address = "/geoconv/v1/";
    }
}
