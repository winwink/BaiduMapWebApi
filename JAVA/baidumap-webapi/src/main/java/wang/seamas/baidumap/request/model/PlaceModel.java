package wang.seamas.baidumap.request.model;

import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 16:57 2018/8/3
 */
public class PlaceModel extends BaiduModel {

    @Required
    private String query;
    private String tag;
    private String scope;
    private String filter;
    private Integer coordType;
    private String retCoordtype;
    private Integer pageSize;
    private Integer pageNum;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Integer getCoordType() {
        return coordType;
    }

    public void setCoordType(Integer coordType) {
        this.coordType = coordType;
    }

    public String getRetCoordtype() {
        return retCoordtype;
    }

    public void setRetCoordtype(String retCoordtype) {
        this.retCoordtype = retCoordtype;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
