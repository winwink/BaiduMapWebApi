package wang.seamas.baidumap.response;

import java.util.List;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:47 2018/8/6
 */
public abstract class BaiduListResultResponse<T> extends BaiduResponse {
    private Integer total;
    private List<T> result;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
