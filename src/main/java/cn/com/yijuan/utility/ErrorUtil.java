package cn.com.yijuan.utility;

/**
 * @author CheneyL
 * 错误信息工具类
 */
public class ErrorUtil {
    public static String parameterErrorFormat(String field, String msg) {
        return "【" + field + " : " + msg + "】";
    }
}
