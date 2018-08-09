package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.request.PlaceSuggestionRequest;
import wang.seamas.baidumap.request.model.PlaceSuggestionModel;
import wang.seamas.baidumap.response.PlaceSuggestionResponse;

import java.io.IOException;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 09:16 2018/8/9
 */
public class PlaceSuggestionTest {

    @Test
    public void test() throws IOException {
        BaiduApiClient client = ClientCreator.Create();
        PlaceSuggestionModel model = new PlaceSuggestionModel();
        model.setQuery("浙江大学");
        model.setRegion("杭州");

        PlaceSuggestionRequest req = new PlaceSuggestionRequest(model);

        PlaceSuggestionResponse res = client.execute(req);
        Assert.assertEquals(res.getStatus(), 0);
    }
}
