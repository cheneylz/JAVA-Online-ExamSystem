package cn.com.yijuan.dao;

import cn.com.yijuan.domain.ExamPaper;
import cn.com.yijuan.domain.other.KeyValue;
import cn.com.yijuan.model.admin.exam.ExamPaperPageRequestVO;
import cn.com.yijuan.model.student.dashboard.PaperFilter;
import cn.com.yijuan.model.student.dashboard.PaperInfo;
import cn.com.yijuan.model.student.exam.ExamPaperPageVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ExamPaperMapper extends BaseMapper<ExamPaper> {

    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaper record);

    int insertSelective(ExamPaper record);

    ExamPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaper record);

    int updateByPrimaryKey(ExamPaper record);

    List<ExamPaper> page(ExamPaperPageRequestVO requestVM);

    List<ExamPaper> taskExamPage(ExamPaperPageRequestVO requestVM);

    List<ExamPaper> studentPage(ExamPaperPageVO requestVM);

    List<PaperInfo> indexPaper(PaperFilter paperFilter);

    Integer selectAllCount();

    List<KeyValue> selectCountByDate(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

    int updateTaskPaper(@Param("taskId") Integer taskId, @Param("paperIds") List<Integer> paperIds);

    int clearTaskPaper(@Param("paperIds") List<Integer> paperIds);
}
