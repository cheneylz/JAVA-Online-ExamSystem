package cn.com.yijuan.configuration.property;

import lombok.Data;

/**
 * @author CheneyL
 * 密码加密配置
 */
@Data
public class PasswordKeyConfig {

    private String publicKey;

    private String privateKey;
}
