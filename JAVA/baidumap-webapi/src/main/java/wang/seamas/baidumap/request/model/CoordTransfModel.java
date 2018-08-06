package wang.seamas.baidumap.request.model;

import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 12:30 2018/8/6
 */
public class CoordTransfModel extends BaiduModel {
    @Required
    private String coords;
    private Integer from;
    private Integer to;

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }
}
