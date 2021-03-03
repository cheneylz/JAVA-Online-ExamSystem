package cn.com.yijuan.model.student.exam;

import cn.com.yijuan.base.BasePage;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ExamPaperPageVO extends BasePage {
    @NotNull
    private Integer paperType;

    private Integer subjectId;

    private Integer levelId;
}
