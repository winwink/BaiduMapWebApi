package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:15 2018/8/8
 */
public class TrafficCondition {
    private String status;
    @JsonProperty("geo_cnt")
    private Integer geoCnt;
    private Double distance;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getGeoCnt() {
        return geoCnt;
    }

    public void setGeoCnt(Integer geoCnt) {
        this.geoCnt = geoCnt;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
