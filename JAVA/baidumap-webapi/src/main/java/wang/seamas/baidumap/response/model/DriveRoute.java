package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:50 2018/8/8
 */
public class DriveRoute {
    public Location origin;
    public Location destination;
    public String tag;
    public Integer distance;
    public Integer duration;
    @JsonProperty("ext_duration")
    public Integer extDuration;
    @JsonProperty("taxi_fee")
    public Integer taxiFee;
    public Integer toll;
    @JsonProperty("toll_distance")
    public Integer tollDistance;
    public DriveStepList steps;

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

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

    public Integer getExtDuration() {
        return extDuration;
    }

    public void setExtDuration(Integer extDuration) {
        this.extDuration = extDuration;
    }

    public Integer getTaxiFee() {
        return taxiFee;
    }

    public void setTaxiFee(Integer taxiFee) {
        this.taxiFee = taxiFee;
    }

    public Integer getToll() {
        return toll;
    }

    public void setToll(Integer toll) {
        this.toll = toll;
    }

    public Integer getTollDistance() {
        return tollDistance;
    }

    public void setTollDistance(Integer tollDistance) {
        this.tollDistance = tollDistance;
    }

    public DriveStepList getSteps() {
        return steps;
    }

    public void setSteps(DriveStepList steps) {
        this.steps = steps;
    }
}
