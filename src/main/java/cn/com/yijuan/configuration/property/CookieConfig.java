package cn.com.yijuan.configuration.property;

/**
 * @author CheneyL
 * cookies配置
 */
public class CookieConfig {

    private static final String COOKIES_NAME = "exam" ;

    private static final Integer COOKIES_INTERVAL = 30 * 24 * 60 * 60;

    public static String getName(){ return COOKIES_NAME;}

    public static Integer getInterval(){return COOKIES_INTERVAL;}
}
