package cn.com.yijuan.model.student.dashboard;

import lombok.Data;

@Data
public class TaskItemPaperVO {

    private Integer examPaperId;

    private String examPaperName;

    private Integer examPaperAnswerId;

    private Integer status;
}
