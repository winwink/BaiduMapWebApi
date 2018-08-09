package wang.seamas.baidumap.response;

import wang.seamas.baidumap.response.model.PublicPlanItem;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:50 2018/8/8
 */
public class PublicPlanResponse extends BaiduSingleResponse<PublicPlanItem> {
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
