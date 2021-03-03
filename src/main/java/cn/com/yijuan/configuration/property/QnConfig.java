package cn.com.yijuan.configuration.property;

import lombok.Data;

/**
 * @author CheneyL
 * 七牛云配置
 */
@Data
public class QnConfig {

    private String url;

    private String bucket;

    private String accessKey;

    private String secretKey;

}
