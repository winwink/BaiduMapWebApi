package wang.seamas.baidumap.response.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:23 2018/8/8
 */
public class RidePlanItem {
    private RideRouteList routes;
    private OriginPoint origin;
    private DestinationPoint destination;

    public RideRouteList getRoutes() {
        return routes;
    }

    public void setRoutes(RideRouteList routes) {
        this.routes = routes;
    }

    public OriginPoint getOrigin() {
        return origin;
    }

    public void setOrigin(OriginPoint origin) {
        this.origin = origin;
    }

    public DestinationPoint getDestination() {
        return destination;
    }

    public void setDestination(DestinationPoint destination) {
        this.destination = destination;
    }
}
