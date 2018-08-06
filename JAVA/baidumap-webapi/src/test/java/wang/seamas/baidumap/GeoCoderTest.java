package wang.seamas.baidumap;

import com.sun.tools.javac.jvm.Code;
import org.junit.Assert;
import org.junit.Test;
import wang.seamas.baidumap.request.GeoCoderRequest;
import wang.seamas.baidumap.request.model.GeoCoderModel;
import wang.seamas.baidumap.response.GeoCoderResponse;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:19 2018/8/6
 */
public class GeoCoderTest {

    @Test
    public void test() {
        BaiduApiClient client = ClientCreator.Create();

        GeoCoderModel model = new GeoCoderModel();
        model.setAddress("杭州市西湖区浙大路38号");

        GeoCoderRequest request = new GeoCoderRequest(model);
        GeoCoderResponse response = client.execute(request);
        Assert.assertEquals(0, response.getStatus());
    }
}
