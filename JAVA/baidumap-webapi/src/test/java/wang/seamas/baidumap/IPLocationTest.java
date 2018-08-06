package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.request.IPLocationRequest;
import wang.seamas.baidumap.request.model.IPModel;
import wang.seamas.baidumap.response.IPLocationResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:22 2018/8/6
 */
public class IPLocationTest {

    @Test
    public void test() {
        BaiduApiClient client = ClientCreator.Create();

        IPModel model = new IPModel();
        IPLocationRequest request = new IPLocationRequest(model);
        IPLocationResponse response = client.execute(request);
        Assert.assertEquals(response.getStatus(), 0);
    }
}
