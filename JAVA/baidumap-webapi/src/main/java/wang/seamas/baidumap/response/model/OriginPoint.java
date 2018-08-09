package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:20 2018/8/8
 */
public class OriginPoint {
    @JsonProperty("area_id")
    private String areaId;
    private String cname;
    private String uid;
    private String wd;
    private Location originPt;

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

    public Location getOriginPt() {
        return originPt;
    }

    public void setOriginPt(Location originPt) {
        this.originPt = originPt;
    }
}
