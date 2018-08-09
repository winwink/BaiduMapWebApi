package wang.seamas.baidumap.response.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:41 2018/8/8
 */
public class Vehicle {
    private Integer type;
    private VehicleDetail detail;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public VehicleDetail getDetail() {
        return detail;
    }

    public void setDetail(VehicleDetail detail) {
        this.detail = detail;
    }
}
