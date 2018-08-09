package wang.seamas.baidumap.response;

import wang.seamas.baidumap.response.model.DrivePlanItem;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:49 2018/8/8
 */
public class DrivePlanResponse extends BaiduSingleResponse<DrivePlanItem> {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
