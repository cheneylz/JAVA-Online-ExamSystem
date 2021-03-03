package cn.com.yijuan.model.student.question.answer;

import cn.com.yijuan.model.admin.question.QuestionEditRequestVO;
import cn.com.yijuan.model.student.exam.ExamPaperSubmitItemVO;
import lombok.Data;

@Data
public class QuestionAnswerVO {
    private QuestionEditRequestVO questionVM;
    private ExamPaperSubmitItemVO questionAnswerVM;
}
