package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:57 2018/8/8
 */
public class DriveStep {
    @JsonProperty("leg_index")
    private Integer legIndex;
    private String direction;
    private Double distance;
    @JsonProperty("road_name")
    private String roadName;
    @JsonProperty("road_type")
    private String roadType;
    private Integer toll;
    @JsonProperty("toll_distance")
    private Integer tollDistance;
    @JsonProperty("toll_gate_name")
    private String tollGateName;
    @JsonProperty("toll_gate_location")
    private Location tollGateLocation;
    @JsonProperty("start_location")
    private Location startLocation;
    @JsonProperty("end_location")
    private Location endLocation;
    private String path;
    @JsonProperty("traffic_condition")
    private TrafficConditionList trafficCondition;

    public Integer getLegIndex() {
        return legIndex;
    }

    public void setLegIndex(Integer legIndex) {
        this.legIndex = legIndex;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
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

    public String getTollGateName() {
        return tollGateName;
    }

    public void setTollGateName(String tollGateName) {
        this.tollGateName = tollGateName;
    }

    public Location getTollGateLocation() {
        return tollGateLocation;
    }

    public void setTollGateLocation(Location tollGateLocation) {
        this.tollGateLocation = tollGateLocation;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TrafficConditionList getTrafficCondition() {
        return trafficCondition;
    }

    public void setTrafficCondition(TrafficConditionList trafficCondition) {
        this.trafficCondition = trafficCondition;
    }
}
