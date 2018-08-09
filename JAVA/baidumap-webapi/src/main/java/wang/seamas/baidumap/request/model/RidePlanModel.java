package wang.seamas.baidumap.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:40 2018/8/8
 */
public class RidePlanModel extends BaiduModel {
    @Required
    private String origin;
    @Required
    private String destination;
    @JsonProperty("coord_type")
    private String coordType;
    @JsonProperty("ret_coordtype")
    private String retCoordtype;
    @JsonProperty("riding_type")
    private String ridingType;
    private String timestamp;
    private String callback;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCoordType() {
        return coordType;
    }

    public void setCoordType(String coordType) {
        this.coordType = coordType;
    }

    public String getRetCoordtype() {
        return retCoordtype;
    }

    public void setRetCoordtype(String retCoordtype) {
        this.retCoordtype = retCoordtype;
    }

    public String getRidingType() {
        return ridingType;
    }

    public void setRidingType(String ridingType) {
        this.ridingType = ridingType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
