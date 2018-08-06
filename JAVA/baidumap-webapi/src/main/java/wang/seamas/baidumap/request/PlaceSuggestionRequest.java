package wang.seamas.baidumap.request;

import wang.seamas.baidumap.request.model.PlaceSuggestionModel;
import wang.seamas.baidumap.response.PlaceSuggestionResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:08 2018/8/6
 */
public class PlaceSuggestionRequest extends BaiduRequest<PlaceSuggestionResponse, PlaceSuggestionModel> {
    public PlaceSuggestionRequest(PlaceSuggestionModel model) {
        super(model);
        this.address = "/place/v2/suggestion";
    }
}
