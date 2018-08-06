package wang.seamas.baidumap.request.model;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:01 2018/8/1
 */
public abstract class BaiduModel {
    private String output;

    public BaiduModel() {
        this("json");
    }

    public BaiduModel(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
