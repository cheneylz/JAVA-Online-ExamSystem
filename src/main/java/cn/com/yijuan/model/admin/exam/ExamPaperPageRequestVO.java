package cn.com.yijuan.model.admin.exam;

import cn.com.yijuan.base.BasePage;
import lombok.Data;

/**
 * @author CheneyL
 */
@Data
public class ExamPaperPageRequestVO extends BasePage {

    private Integer id;

    private Integer subjectId;

    private Integer level;

    private Integer paperType;

    private Integer taskExamId;
}
