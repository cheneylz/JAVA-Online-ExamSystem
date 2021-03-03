package cn.com.yijuan.model.admin.question;

import cn.com.yijuan.model.BaseVO;
import lombok.Data;


/**
 * @author CheneyL
 */
@Data
public class QuestionResponseVO extends BaseVO {

    private Integer id;

    private Integer questionType;

    private Integer textContentId;

    private String createTime;

    private Integer subjectId;

    private Integer createUser;

    private String score;

    private Integer status;

    private String correct;

    private Integer analyzeTextContentId;

    private Integer difficult;

    private String shortTitle;

}
