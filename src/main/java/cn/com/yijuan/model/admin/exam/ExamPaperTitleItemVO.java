package cn.com.yijuan.model.admin.exam;

import cn.com.yijuan.model.admin.question.QuestionEditRequestVO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author CheneyL
 */
@Data
public class ExamPaperTitleItemVO {

    @NotBlank(message = "标题内容不能为空")
    private String name;

    @Size(min = 1,message = "请添加题目")
    @Valid
    private List<QuestionEditRequestVO> questionItems;
}
