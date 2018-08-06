package wang.seamas.baidumap.exception;

import java.lang.reflect.Field;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 10:30 2018/8/1
 */
public class NullOrEmptyException extends Exception {


    public NullOrEmptyException(String message) {
        super(message);
    }

    public NullOrEmptyException(Field field) {
        super("field " + field.getName() + " should not be null or empty");
    }
}
