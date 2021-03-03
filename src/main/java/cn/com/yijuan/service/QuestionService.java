package cn.com.yijuan.service;


import cn.com.yijuan.domain.Question;
import cn.com.yijuan.model.admin.question.QuestionEditRequestVO;
import cn.com.yijuan.model.admin.question.QuestionPageRequestVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author CheneyL
 */
public interface QuestionService extends BaseService<Question> {

    PageInfo<Question> page(QuestionPageRequestVO requestVM);

    Question insertFullQuestion(QuestionEditRequestVO model, Integer userId);

    Question updateFullQuestion(QuestionEditRequestVO model);

    QuestionEditRequestVO getQuestionEditRequestVM(Integer questionId);

    QuestionEditRequestVO getQuestionEditRequestVM(Question question);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}
