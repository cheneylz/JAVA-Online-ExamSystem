package cn.com.yijuan.service;


import cn.com.yijuan.domain.ExamPaperAnswer;
import cn.com.yijuan.domain.ExamPaperAnswerInfo;
import cn.com.yijuan.domain.User;
import cn.com.yijuan.model.student.exam.ExamPaperSubmitVO;
import cn.com.yijuan.model.student.exampaper.ExamPaperAnswerPageVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author CheneyL
 * 答卷服务类
 */
public interface ExamPaperAnswerService extends BaseService<ExamPaperAnswer> {

    /**
     * 学生考试记录分页
     *
     * @param requestVO 过滤条件
     * @return PageInfo<ExamPaperAnswer>
     */
    PageInfo<ExamPaperAnswer> studentPage(ExamPaperAnswerPageVO requestVO);

    /**
     * 计算试卷提交结果(不入库)
     *
     * @param examPaperSubmitVM
     * @param user
     * @return
     */
    ExamPaperAnswerInfo calculateExamPaperAnswer(ExamPaperSubmitVO examPaperSubmitVM, User user);


    /**
     * 试卷批改
     * @param examPaperSubmitVO  examPaperSubmitVM
     * @return String
     */
    String judge(ExamPaperSubmitVO examPaperSubmitVO);

    /**
     * 试卷答题信息转成ViewModel 传给前台
     *
     * @param id 试卷id
     * @return ExamPaperSubmitVM
     */
    ExamPaperSubmitVO examPaperAnswerToVM(Integer id);


    Integer selectAllCount();

    List<Integer> selectMothCount();
}
