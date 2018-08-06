package wang.seamas.baidumap.response;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:50 2018/8/6
 */
public abstract class BaiduSingleResponse<T> extends BaiduResponse {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
