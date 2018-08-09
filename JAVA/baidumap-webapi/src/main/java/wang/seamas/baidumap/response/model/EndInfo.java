package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:18 2018/8/8
 */
public class EndInfo {
    @JsonProperty("end_name")
    private String endName;
    @JsonProperty("end_city")
    private String endCity;
    @JsonProperty("end_uid")
    private String endUid;
    @JsonProperty("end_time")
    private String endTime;

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public String getEndUid() {
        return endUid;
    }

    public void setEndUid(String endUid) {
        this.endUid = endUid;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
