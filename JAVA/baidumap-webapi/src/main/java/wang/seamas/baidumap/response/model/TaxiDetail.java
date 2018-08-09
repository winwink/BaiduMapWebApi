package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:40 2018/8/8
 */
public class TaxiDetail {
    private String desc;
    @JsonProperty("km_price")
    private Double kmPrice;
    @JsonProperty("start_price")
    private Double startPrice;
    @JsonProperty("total_price")
    private Double totalPrice;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getKmPrice() {
        return kmPrice;
    }

    public void setKmPrice(Double kmPrice) {
        this.kmPrice = kmPrice;
    }

    public Double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Double startPrice) {
        this.startPrice = startPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
