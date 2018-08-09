package wang.seamas.baidumap.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:36 2018/8/8
 */
public class PublicPlanModel extends BaiduModel{
    @Required
    private String origin;
    @Required
    private String destination;
    @JsonProperty("coord_type")
    private String coordType;
    @JsonProperty("tactics_incity")
    private Integer tacticsIncity;
    @JsonProperty("tactics_intercity")
    private Integer tacticsIntercity;
    @JsonProperty("trans_type_intercity")
    private Integer transTypeIntercity;
    @JsonProperty("ret_coordtype")
    private String retCoordType;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonProperty("page_index")
    private Integer pageIndex;
    private String timestamp;
    private String callback;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCoordType() {
        return coordType;
    }

    public void setCoordType(String coordType) {
        this.coordType = coordType;
    }

    public Integer getTacticsIncity() {
        return tacticsIncity;
    }

    public void setTacticsIncity(Integer tacticsIncity) {
        this.tacticsIncity = tacticsIncity;
    }

    public Integer getTacticsIntercity() {
        return tacticsIntercity;
    }

    public void setTacticsIntercity(Integer tacticsIntercity) {
        this.tacticsIntercity = tacticsIntercity;
    }

    public Integer getTransTypeIntercity() {
        return transTypeIntercity;
    }

    public void setTransTypeIntercity(Integer transTypeIntercity) {
        this.transTypeIntercity = transTypeIntercity;
    }

    public String getRetCoordType() {
        return retCoordType;
    }

    public void setRetCoordType(String retCoordType) {
        this.retCoordType = retCoordType;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
