package cn.com.yijuan.model.admin.question;

import cn.com.yijuan.base.BasePage;
import lombok.Data;

/**
 * @author CheneyL
 */
@Data
public class QuestionPageRequestVO extends BasePage {

    private Integer id;

    private Integer level;

    private Integer subjectId;

    private Integer questionType;
}
