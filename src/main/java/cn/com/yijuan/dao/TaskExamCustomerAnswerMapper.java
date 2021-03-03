package cn.com.yijuan.dao;

import cn.com.yijuan.domain.TaskExamCustomerAnswer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskExamCustomerAnswerMapper extends BaseMapper<TaskExamCustomerAnswer> {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskExamCustomerAnswer record);

    int insertSelective(TaskExamCustomerAnswer record);

    TaskExamCustomerAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskExamCustomerAnswer record);

    int updateByPrimaryKey(TaskExamCustomerAnswer record);

    TaskExamCustomerAnswer getByTUid(@Param("tid") Integer tid, @Param("uid") Integer uid);

    List<TaskExamCustomerAnswer> selectByTUid(@Param("taskIds") List<Integer> taskIds, @Param("uid") Integer uid);
}
