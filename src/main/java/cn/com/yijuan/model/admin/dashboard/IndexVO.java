package cn.com.yijuan.model.admin.dashboard;

import lombok.Data;

import java.util.List;

/**
 * @author CheneyL
 */
@Data
public class IndexVO {
    private Integer examPaperCount;
    private Integer questionCount;
    private Integer doExamPaperCount;
    private Integer doQuestionCount;
    private List<Integer> mothDayUserActionValue;
    private List<Integer> mothDayDoExamQuestionValue;
    private List<String> mothDayText;
}
