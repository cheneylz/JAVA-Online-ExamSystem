package cn.com.yijuan.configuration.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author CheneyL
 * 系统配置
 */
@ConfigurationProperties(prefix = "system")
@Data
public class SystemConfig {

    private PasswordKeyConfig pwdKey;

    private List<String> securityIgnoreUrls;

    private QnConfig qnConfig;

    private WxConfig wx;
}
