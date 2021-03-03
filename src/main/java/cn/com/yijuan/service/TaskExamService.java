package cn.com.yijuan.service;



import cn.com.yijuan.domain.TaskExam;
import cn.com.yijuan.domain.User;
import cn.com.yijuan.model.admin.task.TaskPageRequestVO;
import cn.com.yijuan.model.admin.task.TaskRequestVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TaskExamService extends BaseService<TaskExam> {

    PageInfo<TaskExam> page(TaskPageRequestVO requestVM);

    void edit(TaskRequestVO model, User user);

    TaskRequestVO taskExamToVM(Integer id);

    List<TaskExam> getByGradeLevel(Integer gradeLevel);
}
