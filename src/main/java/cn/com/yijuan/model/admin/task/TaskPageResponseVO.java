package cn.com.yijuan.model.admin.task;

import lombok.Data;


/**
 * @author CheneyL
 */
@Data
public class TaskPageResponseVO {

    private Integer id;

    private String title;

    private Integer gradeLevel;

    private String createUserName;

    private String createTime;

    private Boolean deleted;

}
