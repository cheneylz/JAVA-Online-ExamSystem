package cn.com.yijuan.controller.student;

import cn.com.yijuan.base.BaseApiController;
import cn.com.yijuan.base.RestResponse;
import cn.com.yijuan.domain.ExamPaper;
import cn.com.yijuan.model.admin.exam.ExamPaperEditRequestVO;
import cn.com.yijuan.model.student.exam.ExamPaperPageResponseVO;
import cn.com.yijuan.model.student.exam.ExamPaperPageVO;
import cn.com.yijuan.service.ExamPaperAnswerService;
import cn.com.yijuan.service.ExamPaperService;
import cn.com.yijuan.utility.DateTimeUtil;
import cn.com.yijuan.utility.PageInfoHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController("StudentExamPaperController")
@RequestMapping(value = "/api/student/exam/paper")
@AllArgsConstructor
public class ExamPaperController extends BaseApiController {

    private final ExamPaperService examPaperService;
    private final ExamPaperAnswerService examPaperAnswerService;
    private final ApplicationEventPublisher eventPublisher;


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<ExamPaperEditRequestVO> select(@PathVariable Integer id) {
        ExamPaperEditRequestVO vm = examPaperService.examPaperToVM(id);
        return RestResponse.ok(vm);
    }


    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public RestResponse<PageInfo<ExamPaperPageResponseVO>> pageList(@RequestBody @Valid ExamPaperPageVO model) {
        PageInfo<ExamPaper> pageInfo = examPaperService.studentPage(model);
        PageInfo<ExamPaperPageResponseVO> page = PageInfoHelper.copyMap(pageInfo, e -> {
            ExamPaperPageResponseVO vm = modelMapper.map(e, ExamPaperPageResponseVO.class);
            vm.setCreateTime(DateTimeUtil.dateFormat(e.getCreateTime()));
            return vm;
        });
        return RestResponse.ok(page);
    }
}
