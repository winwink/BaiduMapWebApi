package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:41 2018/8/6
 */
public class IPContent {
    @JsonProperty("address_detail")
    private IPDetail addressDetail;
    private String address;
    private IPPoint point;

    public IPDetail getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(IPDetail addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IPPoint getPoint() {
        return point;
    }

    public void setPoint(IPPoint point) {
        this.point = point;
    }
}
