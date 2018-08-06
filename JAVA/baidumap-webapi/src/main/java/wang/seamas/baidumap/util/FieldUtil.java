package wang.seamas.baidumap.util;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 12:26 2018/8/1
 */
public class FieldUtil {

    public static Collection<Field> getAllFields(Object object) {
        return getAllFields(object.getClass());
    }

    public static Collection<Field> getAllFields(Class clazz) {
        List<Field> list = new LinkedList<>();
        for(; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            list.addAll(Arrays.asList(fields));
        }
        return list;
    }
}
