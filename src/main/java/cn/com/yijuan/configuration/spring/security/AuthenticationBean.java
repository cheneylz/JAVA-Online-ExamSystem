package cn.com.yijuan.configuration.spring.security;

import lombok.Data;

/**
 * @author CheneyL
 * 登录认证bean
 */
@Data
public class AuthenticationBean {

    private String userName;

    private String password;

    private boolean remember;
}
