package cn.com.yijuan.model.admin.message;

import lombok.Data;

/**
 * @author CheneyL
 */
@Data
public class MessageResponseVO {

    private Integer id;

    private String title;

    private String content;

    private String sendUserName;

    private String receives;

    private Integer receiveUserCount;

    private Integer readCount;

    private String createTime;

}
