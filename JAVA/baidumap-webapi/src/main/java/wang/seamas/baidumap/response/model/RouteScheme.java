package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:34 2018/8/8
 */
public class RouteScheme {
    private Integer distance;
    private Integer duration;
    private String instructions;
    private String path;
    @JsonProperty("traffic_condition")
    private List<Object> trafficCondition;
    @JsonProperty("start_location")
    private Location startLocation;
    @JsonProperty("end_location")
    private Location endLocation;
    @JsonProperty("vehicle_info")
    private Vehicle vehicleInfo;

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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Object> getTrafficCondition() {
        return trafficCondition;
    }

    public void setTrafficCondition(List<Object> trafficCondition) {
        this.trafficCondition = trafficCondition;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public Vehicle getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(Vehicle vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }
}
