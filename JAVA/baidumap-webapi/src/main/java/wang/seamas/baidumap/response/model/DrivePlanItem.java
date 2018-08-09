package wang.seamas.baidumap.response.model;

import java.util.List;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:48 2018/8/8
 */
public class DrivePlanItem {
    private String restriction;
    private Integer total;
    private DriveRouteList routes;

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public DriveRouteList getRoutes() {
        return routes;
    }

    public void setRoutes(DriveRouteList routes) {
        this.routes = routes;
    }
}
