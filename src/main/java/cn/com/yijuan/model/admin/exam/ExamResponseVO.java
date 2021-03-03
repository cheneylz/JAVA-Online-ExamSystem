package cn.com.yijuan.model.admin.exam;

import lombok.Data;

/**
 * @author CheneyL
 */
@Data
public class ExamResponseVO {

    private Integer id;

    private String name;

    private Integer questionCount;

    private Integer score;

    private String createTime;

    private Integer createUser;

    private Integer subjectId;

    private Integer paperType;

    private Integer frameTextContentId;
}
