package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:30 2018/8/8
 */
public class PublicRoute {
    private Integer distance;
    private Integer duration;
    @JsonProperty("arrive_time")
    private String arriveTime;
    private Double price;
    @JsonProperty("price_detail")
    private PriceDetailList priceDetail;
    private RouteSchemeListList steps;

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

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PriceDetailList getPriceDetail() {
        return priceDetail;
    }

    public void setPriceDetail(PriceDetailList priceDetail) {
        this.priceDetail = priceDetail;
    }

    public RouteSchemeListList getSteps() {
        return steps;
    }

    public void setSteps(RouteSchemeListList steps) {
        this.steps = steps;
    }
}
