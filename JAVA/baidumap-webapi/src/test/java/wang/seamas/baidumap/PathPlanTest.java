package wang.seamas.baidumap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wang.seamas.baidumap.request.DrivePlanRequest;
import wang.seamas.baidumap.request.GeoCoderRequest;
import wang.seamas.baidumap.request.PublicPlanRequest;
import wang.seamas.baidumap.request.RidePlanRequest;
import wang.seamas.baidumap.request.model.DrivePlanModel;
import wang.seamas.baidumap.request.model.GeoCoderModel;
import wang.seamas.baidumap.request.model.PublicPlanModel;
import wang.seamas.baidumap.request.model.RidePlanModel;
import wang.seamas.baidumap.response.DrivePlanResponse;
import wang.seamas.baidumap.response.GeoCoderResponse;
import wang.seamas.baidumap.response.PublicPlanResponse;
import wang.seamas.baidumap.response.RidePlanResponse;
import wang.seamas.baidumap.response.model.Location;

import java.io.IOException;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 09:26 2018/8/9
 */
public class PathPlanTest {


    private Location startLocation;
    private Location endLocation;


    @Before
    public void setUp() {
        BaiduApiClient client = ClientCreator.Create();
        GeoCoderModel startModel = new GeoCoderModel();
        startModel.setAddress("浙江省杭州市西湖区浙大路38号");

        GeoCoderRequest startRequest = new GeoCoderRequest(startModel);
        GeoCoderResponse startResponse = client.execute(startRequest);


        GeoCoderModel endModel = new GeoCoderModel();
        endModel.setAddress("浙江省杭州市拱墅区环城北路318号");

        GeoCoderRequest endRequest = new GeoCoderRequest(endModel);
        GeoCoderResponse endResponse = client.execute(endRequest);

        startLocation = startResponse.getResult().getLocation();
        endLocation = endResponse.getResult().getLocation();
    }


    @Test
    public void publicTest() throws IOException {

        PublicPlanModel model = new PublicPlanModel();
        model.setOrigin(startLocation.getLat() + "," + startLocation.getLng());
        model.setDestination(endLocation.getLat() + "," + endLocation.getLng());


        PublicPlanRequest req = new PublicPlanRequest(model);
        BaiduApiClient client = ClientCreator.Create();

//        String str = client.executeReadString(req);
//        System.out.print(str);
        PublicPlanResponse result = client.execute(req);
        Assert.assertEquals(result.getStatus(), 0);
    }

    @Test
    public void rideTest() throws IOException {
        RidePlanModel model = new RidePlanModel();
        model.setOrigin(startLocation.getLat() + "," + startLocation.getLng());
        model.setDestination(endLocation.getLat() + "," + endLocation.getLng());

        RidePlanRequest req = new RidePlanRequest(model);

        BaiduApiClient client = ClientCreator.Create();

        RidePlanResponse result = client.execute(req);
        Assert.assertEquals(result.getStatus(), 0);
    }

    @Test
    public void driveTest() throws IOException {
        DrivePlanModel model = new DrivePlanModel();
        model.setOrigin(startLocation.getLat() + "," + startLocation.getLng());
        model.setDestination(endLocation.getLat() + "," + endLocation.getLng());

        DrivePlanRequest req = new DrivePlanRequest(model);

        BaiduApiClient client = ClientCreator.Create();

        DrivePlanResponse result = client.execute(req);
        Assert.assertEquals(result.getStatus(), 0);
    }
}
