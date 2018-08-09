package wang.seamas.baidumap.response.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:25 2018/8/8
 */
public class RideRoute {
    private Integer distance;
    private Integer duration;
    private RideStepList steps;
    private Location originLocation;
    private Location destinationLocation;

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

    public RideStepList getSteps() {
        return steps;
    }

    public void setSteps(RideStepList steps) {
        this.steps = steps;
    }

    public Location getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(Location originLocation) {
        this.originLocation = originLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(Location destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
}
