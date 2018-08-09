package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:42 2018/8/8
 */
public class VehicleDetail {
    private String name;
    private Double price;
    private String booking;
    @JsonProperty("departure_station")
    private String departureStation;
    @JsonProperty("arrive_station")
    private String arriveStation;
    @JsonProperty("departure_time")
    private String departureTime;
    @JsonProperty("arrive_time")
    private String arriveTime;
    @JsonProperty("start_info")
    private StartInfo startInfo;
    @JsonProperty("end_info")
    private EndInfo endInfo;

    private Double discount;
    private String airLines;

    private Integer type;
    @JsonProperty("stop_num")
    private Integer stopNum;
    @JsonProperty("on_station")
    private String onStation;
    @JsonProperty("off_station")
    private String offStation;
    @JsonProperty("first_time")
    private String firstTime;
    @JsonProperty("last_time")
    private String lastTime;

    @JsonProperty("provider_name")
    private String providerName;
    @JsonProperty("provider_url")
    private String providerUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArriveStation() {
        return arriveStation;
    }

    public void setArriveStation(String arriveStation) {
        this.arriveStation = arriveStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public StartInfo getStartInfo() {
        return startInfo;
    }

    public void setStartInfo(StartInfo startInfo) {
        this.startInfo = startInfo;
    }

    public EndInfo getEndInfo() {
        return endInfo;
    }

    public void setEndInfo(EndInfo endInfo) {
        this.endInfo = endInfo;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getAirLines() {
        return airLines;
    }

    public void setAirLines(String airLines) {
        this.airLines = airLines;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStopNum() {
        return stopNum;
    }

    public void setStopNum(Integer stopNum) {
        this.stopNum = stopNum;
    }

    public String getOnStation() {
        return onStation;
    }

    public void setOnStation(String onStation) {
        this.onStation = onStation;
    }

    public String getOffStation() {
        return offStation;
    }

    public void setOffStation(String offStation) {
        this.offStation = offStation;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }
}
