package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:38 2018/8/8
 */
public class StartInfo {
    @JsonProperty("start_name")
    private String startName;
    @JsonProperty("start_city")
    private String startCity;
    @JsonProperty("start_uid")
    private String startUid;
    @JsonProperty("start_time")
    private String startTime;

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getStartUid() {
        return startUid;
    }

    public void setStartUid(String startUid) {
        this.startUid = startUid;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
