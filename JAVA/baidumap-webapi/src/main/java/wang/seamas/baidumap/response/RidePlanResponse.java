package wang.seamas.baidumap.response;

import wang.seamas.baidumap.response.model.CopyRightInfo;
import wang.seamas.baidumap.response.model.RidePlanItem;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:51 2018/8/8
 */
public class RidePlanResponse extends BaiduSingleResponse<RidePlanItem> {
    private CopyRightInfo info;
    private Integer type;

    public CopyRightInfo getInfo() {
        return info;
    }

    public void setInfo(CopyRightInfo info) {
        this.info = info;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
