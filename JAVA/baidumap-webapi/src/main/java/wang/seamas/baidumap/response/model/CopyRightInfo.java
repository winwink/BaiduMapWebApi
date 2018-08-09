package wang.seamas.baidumap.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:45 2018/8/8
 */
public class CopyRightInfo {
    private CopyRight copyright;

    public CopyRight getCopyright() {
        return copyright;
    }

    public void setCopyright(CopyRight copyright) {
        this.copyright = copyright;
    }
}
