package wang.seamas.baidumap.util;


import com.sun.tools.javac.util.StringUtils;
import wang.seamas.baidumap.annotation.Required;
import wang.seamas.baidumap.exception.NullOrEmptyException;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:29 2018/8/1
 */
public final class MapUtil {

    public static Map<String, String> getFieldsMap(Object object) throws NullOrEmptyException {
        return getFieldsMap(object, Strategy.IgnoreNullOrEmpty);
    }

    public static Map<String, String> getFieldsMap(Object object, Strategy strategy) throws NullOrEmptyException {
        Map<String, String> map = new LinkedHashMap<>(32);
        Collection<Field> collection = FieldUtil.getAllFields(object);

        for(Field field : collection) {
            String key = field.getName();
            String value = "";

            field.setAccessible(true);
            try {
                Object obj = field.get(object);
                if (obj != null) {
                    value = obj.toString();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            Required required = field.getAnnotation(Required.class);
            if (required != null && required.value() && StringUtil.isNullOrEmpty(value)) {
                throw new NullOrEmptyException(field);
            }

            if (strategy == Strategy.Normal || !StringUtil.isNullOrEmpty(value)) {
                map.put(key, value);
            }
        }

        return map;
    }
}
