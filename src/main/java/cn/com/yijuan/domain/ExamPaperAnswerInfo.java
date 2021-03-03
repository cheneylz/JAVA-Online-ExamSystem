package cn.com.yijuan.domain;

import lombok.Data;

import java.util.List;

/**
 * @author CheneyL
 * 试卷答案关联实体
 */
@Data
public class ExamPaperAnswerInfo {
    public ExamPaper examPaper;
    public ExamPaperAnswer examPaperAnswer;
    public List<ExamPaperQuestionCustomerAnswer> examPaperQuestionCustomerAnswers;
}
