package wang.seamas.baidumap.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:55 2018/8/6
 */
public class GeoCoderModel extends BaiduModel {
    @Required
    private String address;
    private String city;
    @JsonProperty("ret_coordtype")
    private String retCoordtype;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRetCoordtype() {
        return retCoordtype;
    }

    public void setRetCoordtype(String retCoordtype) {
        this.retCoordtype = retCoordtype;
    }
}
