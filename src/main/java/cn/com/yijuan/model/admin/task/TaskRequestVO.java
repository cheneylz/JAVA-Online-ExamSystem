package cn.com.yijuan.model.admin.task;

import cn.com.yijuan.model.admin.exam.ExamResponseVO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


/**
 * @author CheneyL
 */
@Data
public class TaskRequestVO {

    private Integer id;

    @NotNull
    private Integer gradeLevel;

    @NotNull
    private String title;

    @Size(min = 1, message = "请添加试卷")
    @Valid
    private List<ExamResponseVO> paperItems;
}
