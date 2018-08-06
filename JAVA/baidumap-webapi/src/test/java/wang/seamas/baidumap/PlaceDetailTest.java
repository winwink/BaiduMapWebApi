package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.request.PlaceDetailRequest;
import wang.seamas.baidumap.request.model.PlaceDetailModel;
import wang.seamas.baidumap.response.PlaceDetailResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:56 2018/8/6
 */
public class PlaceDetailTest {

    @Test
    public void test()
    {
        BaiduApiClient baiduClient = ClientCreator.Create();
        PlaceDetailModel model = new PlaceDetailModel();
        model.setUid("d5101afd619d12c7f423100e");

        PlaceDetailRequest request = new PlaceDetailRequest(model);
        PlaceDetailResponse response = baiduClient.execute(request);
        Assert.assertEquals(response.getStatus(), 0);
    }
}
