package wang.seamas.baidumap.response;

import java.util.List;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:53 2018/8/3
 */
public abstract class BaiduListResultsResponse<T> extends BaiduResponse {

    private Integer total;
    private List<T> results;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
