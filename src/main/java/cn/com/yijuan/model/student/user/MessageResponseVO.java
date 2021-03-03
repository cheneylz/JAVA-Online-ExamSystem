package cn.com.yijuan.model.student.user;

import lombok.Data;

@Data
public class MessageResponseVO {
    private Integer id;

    private String title;

    private Integer messageId;

    private String content;

    private Boolean readed;

    private String  createTime;

    private String sendUserName;
}
