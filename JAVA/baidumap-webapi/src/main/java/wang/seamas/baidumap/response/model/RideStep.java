package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:27 2018/8/8
 */
public class RideStep {
    private Integer area;
    private Integer direction;
    private Integer distance;
    private Integer duration;
    private String instructions;
    private String name;
    private String path;
    private String type;
    @JsonProperty("turn_type")
    private String turnType;
    private Location stepOriginLocation;
    private Location stepDestinationLocation;
    private List<Object> pois;
    private String stepOriginInstruction;
    private String stepDestinationInstruction;

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTurnType() {
        return turnType;
    }

    public void setTurnType(String turnType) {
        this.turnType = turnType;
    }

    public Location getStepOriginLocation() {
        return stepOriginLocation;
    }

    public void setStepOriginLocation(Location stepOriginLocation) {
        this.stepOriginLocation = stepOriginLocation;
    }

    public Location getStepDestinationLocation() {
        return stepDestinationLocation;
    }

    public void setStepDestinationLocation(Location stepDestinationLocation) {
        this.stepDestinationLocation = stepDestinationLocation;
    }

    public List<Object> getPois() {
        return pois;
    }

    public void setPois(List<Object> pois) {
        this.pois = pois;
    }

    public String getStepOriginInstruction() {
        return stepOriginInstruction;
    }

    public void setStepOriginInstruction(String stepOriginInstruction) {
        this.stepOriginInstruction = stepOriginInstruction;
    }

    public String getStepDestinationInstruction() {
        return stepDestinationInstruction;
    }

    public void setStepDestinationInstruction(String stepDestinationInstruction) {
        this.stepDestinationInstruction = stepDestinationInstruction;
    }
}
