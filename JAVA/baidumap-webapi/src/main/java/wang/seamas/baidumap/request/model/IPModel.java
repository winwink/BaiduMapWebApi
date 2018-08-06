package wang.seamas.baidumap.request.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:56 2018/8/6
 */
public class IPModel extends BaiduModel {
    private String ip;
    private String coor;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCoor() {
        return coor;
    }

    public void setCoor(String coor) {
        this.coor = coor;
    }
}
