package cn.com.yijuan.model.student.exam;

import cn.com.yijuan.model.admin.exam.ExamPaperEditRequestVO;
import lombok.Data;

@Data
public class ExamPaperReadVO {
    private ExamPaperEditRequestVO paper;
    private ExamPaperSubmitVO answer;
}
