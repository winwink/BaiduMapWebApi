package wang.seamas.baidumap.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:55 2018/8/1
 */
public abstract class BaiduResponse {

    private int status;
    private String message;

    @JsonIgnore
    private String meta;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
}
