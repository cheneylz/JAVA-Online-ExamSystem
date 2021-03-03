package cn.com.yijuan.controller.student;

import cn.com.yijuan.base.BaseApiController;
import cn.com.yijuan.base.RestResponse;
import cn.com.yijuan.domain.ExamPaperQuestionCustomerAnswer;
import cn.com.yijuan.domain.Subject;
import cn.com.yijuan.domain.TextContent;
import cn.com.yijuan.domain.question.QuestionObject;
import cn.com.yijuan.model.admin.question.QuestionEditRequestVO;
import cn.com.yijuan.model.student.exam.ExamPaperSubmitItemVO;
import cn.com.yijuan.model.student.question.answer.QuestionAnswerVO;
import cn.com.yijuan.model.student.question.answer.QuestionPageStudentRequestVO;
import cn.com.yijuan.model.student.question.answer.QuestionPageStudentResponseVO;
import cn.com.yijuan.service.ExamPaperQuestionCustomerAnswerService;
import cn.com.yijuan.service.QuestionService;
import cn.com.yijuan.service.SubjectService;
import cn.com.yijuan.service.TextContentService;
import cn.com.yijuan.utility.DateTimeUtil;
import cn.com.yijuan.utility.HtmlUtil;
import cn.com.yijuan.utility.JsonUtil;
import cn.com.yijuan.utility.PageInfoHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("StudentQuestionAnswerController")
@RequestMapping(value = "/api/student/question/answer")
@AllArgsConstructor
public class QuestionAnswerController extends BaseApiController {

    private final ExamPaperQuestionCustomerAnswerService examPaperQuestionCustomerAnswerService;
    private final QuestionService questionService;
    private final TextContentService textContentService;
    private final SubjectService subjectService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public RestResponse<PageInfo<QuestionPageStudentResponseVO>> pageList(@RequestBody QuestionPageStudentRequestVO model) {
        model.setCreateUser(getCurrentUser().getId());
        PageInfo<ExamPaperQuestionCustomerAnswer> pageInfo = examPaperQuestionCustomerAnswerService.studentPage(model);
        PageInfo<QuestionPageStudentResponseVO> page = PageInfoHelper.copyMap(pageInfo, q -> {
            Subject subject = subjectService.selectById(q.getSubjectId());
            QuestionPageStudentResponseVO vm = modelMapper.map(q, QuestionPageStudentResponseVO.class);
            vm.setCreateTime(DateTimeUtil.dateFormat(q.getCreateTime()));
            TextContent textContent = textContentService.selectById(q.getQuestionTextContentId());
            QuestionObject questionObject = JsonUtil.toJsonObject(textContent.getContent(), QuestionObject.class);
            String clearHtml = HtmlUtil.clear(questionObject.getTitleContent());
            vm.setShortTitle(clearHtml);
            vm.setSubjectName(subject.getName());
            return vm;
        });
        return RestResponse.ok(page);
    }


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<QuestionAnswerVO> select(@PathVariable Integer id) {
        QuestionAnswerVO vm = new QuestionAnswerVO();
        ExamPaperQuestionCustomerAnswer examPaperQuestionCustomerAnswer = examPaperQuestionCustomerAnswerService.selectById(id);
        ExamPaperSubmitItemVO questionAnswerVM = examPaperQuestionCustomerAnswerService.examPaperQuestionCustomerAnswerToVM(examPaperQuestionCustomerAnswer);
        QuestionEditRequestVO questionVM = questionService.getQuestionEditRequestVM(examPaperQuestionCustomerAnswer.getQuestionId());
        vm.setQuestionVM(questionVM);
        vm.setQuestionAnswerVM(questionAnswerVM);
        return RestResponse.ok(vm);
    }

}
