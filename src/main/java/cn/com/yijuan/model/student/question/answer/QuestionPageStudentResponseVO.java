package cn.com.yijuan.model.student.question.answer;

import lombok.Data;

@Data
public class QuestionPageStudentResponseVO {
    private Integer id;

    private Integer questionType;

    private String createTime;

    private String subjectName;

    private String shortTitle;
}
