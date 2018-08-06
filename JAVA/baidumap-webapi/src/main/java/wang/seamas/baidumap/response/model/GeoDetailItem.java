package wang.seamas.baidumap.response.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:39 2018/8/6
 */
public class GeoDetailItem {
    private Location location;
    private Integer precise;
    private Integer confidence;
    private String level;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getPrecise() {
        return precise;
    }

    public void setPrecise(Integer precise) {
        this.precise = precise;
    }

    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
