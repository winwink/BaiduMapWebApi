package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:46 2018/8/8
 */
public class DestinationPoint {
    @JsonProperty("area_id")
    private String areaId;
    private String cname;
    private String uid;
    private String wd;
    private Location destinationPt;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public Location getDestinationPt() {
        return destinationPt;
    }

    public void setDestinationPt(Location destinationPt) {
        this.destinationPt = destinationPt;
    }
}
