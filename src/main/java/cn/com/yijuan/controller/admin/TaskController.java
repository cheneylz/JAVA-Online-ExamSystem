package cn.com.yijuan.controller.admin;

import cn.com.yijuan.base.BaseApiController;
import cn.com.yijuan.base.RestResponse;
import cn.com.yijuan.domain.TaskExam;
import cn.com.yijuan.model.admin.task.TaskPageRequestVO;
import cn.com.yijuan.model.admin.task.TaskPageResponseVO;
import cn.com.yijuan.model.admin.task.TaskRequestVO;
import cn.com.yijuan.service.TaskExamService;
import cn.com.yijuan.utility.DateTimeUtil;
import cn.com.yijuan.utility.PageInfoHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController("AdminTaskController")
@RequestMapping(value = "/api/admin/task")
@AllArgsConstructor
public class TaskController extends BaseApiController {

    private final TaskExamService taskExamService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public RestResponse<PageInfo<TaskPageResponseVO>> pageList(@RequestBody TaskPageRequestVO model) {
        PageInfo<TaskExam> pageInfo = taskExamService.page(model);
        PageInfo<TaskPageResponseVO> page = PageInfoHelper.copyMap(pageInfo, m -> {
            TaskPageResponseVO vm = modelMapper.map(m, TaskPageResponseVO.class);
            vm.setCreateTime(DateTimeUtil.dateFormat(m.getCreateTime()));
            return vm;
        });
        return RestResponse.ok(page);
    }


    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public RestResponse edit(@RequestBody @Valid TaskRequestVO model) {
        taskExamService.edit(model, getCurrentUser());
        TaskRequestVO vm = taskExamService.taskExamToVM(model.getId());
        return RestResponse.ok(vm);
    }


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<TaskRequestVO> select(@PathVariable Integer id) {
        TaskRequestVO vm = taskExamService.taskExamToVM(id);
        return RestResponse.ok(vm);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public RestResponse delete(@PathVariable Integer id) {
        TaskExam taskExam = taskExamService.selectById(id);
        taskExam.setDeleted(true);
        taskExamService.updateByIdFilter(taskExam);
        return RestResponse.ok();
    }
}
