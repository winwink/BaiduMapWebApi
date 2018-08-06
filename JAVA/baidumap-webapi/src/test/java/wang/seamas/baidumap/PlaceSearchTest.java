package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.request.PlaceSearchRequest;
import wang.seamas.baidumap.request.model.PlaceCircumModel;
import wang.seamas.baidumap.request.model.PlaceRectangeModel;
import wang.seamas.baidumap.request.model.PlaceRegionModel;
import wang.seamas.baidumap.response.PlaceSearchResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:59 2018/8/6
 */
public class PlaceSearchTest {

    @Test
    public void ExecuteRegionSearch()
    {
        BaiduApiClient baiduClient = ClientCreator.Create();
        PlaceRegionModel model = new PlaceRegionModel();
        model.setQuery("ATM机");
        model.setTag("银行");
        model.setRegion("杭州");

        PlaceSearchRequest<PlaceRegionModel> req = new PlaceSearchRequest<PlaceRegionModel>(model);
        PlaceSearchResponse resp = baiduClient.execute(req);
        Assert.assertEquals(resp.getStatus(), 0);
    }

    @Test
    public void ExecuteCircumSearch()
    {
        BaiduApiClient baiduClient = ClientCreator.Create();
        PlaceCircumModel model = new PlaceCircumModel();
        model.setQuery("银行");
        model.setLocation("39.915,116.404");
        model.setRadius("2000");

        PlaceSearchRequest<PlaceCircumModel> req = new PlaceSearchRequest<>(model);
        PlaceSearchResponse resp = baiduClient.execute(req);
        Assert.assertEquals(resp.getStatus(), 0);
    }

    @Test
    public void ExecuteRectangeSearch()
    {
        BaiduApiClient baiduClient = ClientCreator.Create();
        PlaceRectangeModel model = new PlaceRectangeModel();
        model.setQuery("银行");
        model.setBounds("39.915,116.404,39.975,116.414");

        PlaceSearchRequest<PlaceRectangeModel> req = new PlaceSearchRequest<>(model);
        PlaceSearchResponse resp = baiduClient.execute(req);
        Assert.assertEquals(resp.getStatus(), 0);
    }
}
