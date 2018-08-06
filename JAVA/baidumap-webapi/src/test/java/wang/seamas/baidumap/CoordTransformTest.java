package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.request.CoorTransformRequest;
import wang.seamas.baidumap.request.model.CoordTransfModel;
import wang.seamas.baidumap.response.CoordTransformResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 12:34 2018/8/6
 */
public class CoordTransformTest {

    @Test
    public void test() {
        BaiduApiClient client = ClientCreator.Create();

        CoordTransfModel model = new CoordTransfModel();
        model.setCoords("114.21892734521,29.575429778924");

        CoorTransformRequest request = new CoorTransformRequest(model);
        CoordTransformResponse response = client.execute(request);
        Assert.assertEquals(0, response.getStatus());
    }
}
