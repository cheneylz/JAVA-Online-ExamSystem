package cn.com.yijuan.dao;

import cn.com.yijuan.domain.TaskExam;
import cn.com.yijuan.model.admin.task.TaskPageRequestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskExamMapper extends BaseMapper<TaskExam> {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskExam record);

    int insertSelective(TaskExam record);

    TaskExam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskExam record);

    int updateByPrimaryKey(TaskExam record);

    List<TaskExam> page(TaskPageRequestVO requestVO);

    List<TaskExam> getByGradeLevel(Integer gradeLevel);
}
