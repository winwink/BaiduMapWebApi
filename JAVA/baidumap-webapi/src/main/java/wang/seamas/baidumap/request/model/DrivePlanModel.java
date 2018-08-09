package wang.seamas.baidumap.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:30 2018/8/8
 */
public class DrivePlanModel extends BaiduModel {
    @Required
    private String origin;
    @Required
    private String destination;
    @JsonProperty("origin_uid")
    private String originUid;
    @JsonProperty("destination_uid")
    private String destination_uid;
    private String waypoints;
    @JsonProperty("coord_type")
    private String coordType;
    private String tactics;
    private String alternatives;
    @JsonProperty("plate_number")
    private String plateNumber;
    @JsonProperty("ext_departure_time")
    private String extDepartureTime;
    @JsonProperty("gps_direction")
    private String GpsDirection;
    private Double radius;
    private Double Speed;
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

    public String getOriginUid() {
        return originUid;
    }

    public void setOriginUid(String originUid) {
        this.originUid = originUid;
    }

    public String getDestination_uid() {
        return destination_uid;
    }

    public void setDestination_uid(String destination_uid) {
        this.destination_uid = destination_uid;
    }

    public String getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(String waypoints) {
        this.waypoints = waypoints;
    }

    public String getCoordType() {
        return coordType;
    }

    public void setCoordType(String coordType) {
        this.coordType = coordType;
    }

    public String getTactics() {
        return tactics;
    }

    public void setTactics(String tactics) {
        this.tactics = tactics;
    }

    public String getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String alternatives) {
        this.alternatives = alternatives;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getExtDepartureTime() {
        return extDepartureTime;
    }

    public void setExtDepartureTime(String extDepartureTime) {
        this.extDepartureTime = extDepartureTime;
    }

    public String getGpsDirection() {
        return GpsDirection;
    }

    public void setGpsDirection(String gpsDirection) {
        GpsDirection = gpsDirection;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getSpeed() {
        return Speed;
    }

    public void setSpeed(Double speed) {
        Speed = speed;
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
