package wang.seamas.baidumap.request.model;

import wang.seamas.baidumap.annotation.Required;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:00 2018/8/6
 */
public class PlaceRectangeModel extends PlaceModel {
    @Required
    private String bounds;

    public String getBounds() {
        return bounds;
    }

    public void setBounds(String bounds) {
        this.bounds = bounds;
    }
}
