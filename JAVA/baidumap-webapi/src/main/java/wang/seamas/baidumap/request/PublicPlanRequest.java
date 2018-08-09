package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.BaiduRequest;
import wang.seamas.baidumap.request.model.PublicPlanModel;
import wang.seamas.baidumap.response.PublicPlanResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:54 2018/8/8
 */
public class PublicPlanRequest extends BaiduRequest<PublicPlanResponse, PublicPlanModel> {

    public PublicPlanRequest(PublicPlanModel model){
        super(model);

        this.address = "/direction/v2/transit";

        this.requiredTimestamp = true;
    }

}