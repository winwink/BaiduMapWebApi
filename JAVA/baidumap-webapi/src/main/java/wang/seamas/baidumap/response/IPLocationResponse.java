package wang.seamas.baidumap.response;

import wang.seamas.baidumap.response.model.IPContent;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:53 2018/8/6
 */
public class IPLocationResponse extends BaiduResponse {
    private String address;
    private IPContent content;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IPContent getContent() {
        return content;
    }

    public void setContent(IPContent content) {
        this.content = content;
    }
}
