package cn.com.yijuan.model.student.dashboard;

import lombok.Data;

import java.util.List;

@Data
public class TaskItemVO {

    private Integer id;

    private String title;

    private List<TaskItemPaperVO> paperItems;
}
