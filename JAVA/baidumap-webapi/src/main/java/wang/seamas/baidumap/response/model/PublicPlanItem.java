package wang.seamas.baidumap.response.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:21 2018/8/8
 */
public class PublicPlanItem {

    private City origin;
    private City destination;
    private Taxi taxi;
    private PublicRouteList routes;
    private Integer total;

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public PublicRouteList getRoutes() {
        return routes;
    }

    public void setRoutes(PublicRouteList routes) {
        this.routes = routes;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
