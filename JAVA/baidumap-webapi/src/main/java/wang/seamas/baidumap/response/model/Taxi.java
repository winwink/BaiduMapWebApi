package wang.seamas.baidumap.response.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:37 2018/8/8
 */
public class Taxi {
    private Integer distance;
    private Integer duration;
    private String remark;
    private TaxiDetailList detail;

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TaxiDetailList getDetail() {
        return detail;
    }

    public void setDetail(TaxiDetailList detail) {
        this.detail = detail;
    }
}
