package cn.com.yijuan.model.admin.user;

import lombok.Data;


/**
 * @author CheneyL
 */
@Data
public class UserEventLogVO {

    private Integer id;

    private Integer userId;

    private String userName;

    private String realName;

    private String content;

    private String createTime;

}
