package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.DrivePlanModel;
import wang.seamas.baidumap.response.DrivePlanResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:52 2018/8/8
 */
public class DrivePlanRequest extends BaiduRequest<DrivePlanResponse, DrivePlanModel> {

    public DrivePlanRequest(DrivePlanModel model) {
        super(model);

        this.address = "/direction/v2/driving";
        this.requiredTimestamp = true;
    }
}
