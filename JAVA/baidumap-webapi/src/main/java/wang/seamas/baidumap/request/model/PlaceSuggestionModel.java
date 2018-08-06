package wang.seamas.baidumap.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:01 2018/8/6
 */
public class PlaceSuggestionModel extends BaiduModel {

    @Required
    private String query;
    @Required
    private String region;
    @JsonProperty("city_limit")
    private Boolean cityLimit;
    private String location;
    @JsonProperty("coord_type")
    private Integer coordType;
    @JsonProperty("ret_coordtype")
    private String retCoordtype;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getCityLimit() {
        return cityLimit;
    }

    public void setCityLimit(Boolean cityLimit) {
        this.cityLimit = cityLimit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCoordType() {
        return coordType;
    }

    public void setCoordType(Integer coordType) {
        this.coordType = coordType;
    }

    public String getRetCoordtype() {
        return retCoordtype;
    }

    public void setRetCoordtype(String retCoordtype) {
        this.retCoordtype = retCoordtype;
    }
}
