package cn.com.yijuan.model.student.user;

import lombok.Data;

@Data
public class UserEventLogVO {

    private Integer id;

    private Integer userId;

    private String userName;

    private String realName;

    private String content;

    private String createTime;

}
