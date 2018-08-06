package wang.seamas.baidumap.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:58 2018/8/6
 */
public class PlaceCircumModel extends PlaceModel {

    @Required
    private String location;
    private String radius;
    @JsonProperty("radius_limit")
    private String radiusLimit;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getRadiusLimit() {
        return radiusLimit;
    }

    public void setRadiusLimit(String radiusLimit) {
        this.radiusLimit = radiusLimit;
    }
}
