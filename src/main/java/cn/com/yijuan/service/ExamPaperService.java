package cn.com.yijuan.service;



import cn.com.yijuan.domain.ExamPaper;
import cn.com.yijuan.domain.User;
import cn.com.yijuan.model.admin.exam.ExamPaperEditRequestVO;
import cn.com.yijuan.model.admin.exam.ExamPaperPageRequestVO;
import cn.com.yijuan.model.student.dashboard.PaperFilter;
import cn.com.yijuan.model.student.dashboard.PaperInfo;
import cn.com.yijuan.model.student.exam.ExamPaperPageVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ExamPaperService extends BaseService<ExamPaper> {

    PageInfo<ExamPaper> page(ExamPaperPageRequestVO requestVM);

    PageInfo<ExamPaper> taskExamPage(ExamPaperPageRequestVO requestVM);

    PageInfo<ExamPaper> studentPage(ExamPaperPageVO requestVM);

    ExamPaper savePaperFromVM(ExamPaperEditRequestVO examPaperEditRequestVM, User user);

    ExamPaperEditRequestVO examPaperToVM(Integer id);

    List<PaperInfo> indexPaper(PaperFilter paperFilter);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}
