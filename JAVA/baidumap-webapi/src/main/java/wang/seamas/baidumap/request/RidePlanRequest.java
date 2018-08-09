package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.RidePlanModel;
import wang.seamas.baidumap.response.RidePlanResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:55 2018/8/8
 */
public class RidePlanRequest extends BaiduRequest<RidePlanResponse, RidePlanModel>{

    public RidePlanRequest(RidePlanModel model){
        super(model);
        this.address = "/direction/v2/riding";
        this.requiredTimestamp = true;
    }
}