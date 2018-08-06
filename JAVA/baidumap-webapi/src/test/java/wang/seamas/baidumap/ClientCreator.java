package wang.seamas.baidumap;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:16 2018/8/6
 */
public class ClientCreator {

    private static final String ak = "";
    private static final String sk = "";

    public static BaiduApiClient Create()
    {
        return new BaiduApiClient(ak, sk);
    }
}
