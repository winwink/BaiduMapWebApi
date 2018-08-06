package wang.seamas.baidumap.util;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 12:47 2018/8/1
 */
public class StringUtil {

    public static boolean isNullOrEmpty(String obj) {
        if (obj == null || obj.length() == 0) {
            return true;
        }
        return false;
    }
}
