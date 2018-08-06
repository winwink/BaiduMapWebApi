package wang.seamas.baidumap.request.model;

import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 17:02 2018/8/3
 */
public class PlaceRegionModel extends PlaceModel {

    @Required
    private String region;
    private String cityLimit;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCityLimit() {
        return cityLimit;
    }

    public void setCityLimit(String cityLimit) {
        this.cityLimit = cityLimit;
    }
}
