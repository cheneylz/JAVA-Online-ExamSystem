package cn.com.yijuan.model.student.dashboard;

import lombok.Data;

import java.util.List;

@Data
public class IndexVO {

    private List<PaperInfo> fixedPaper;

    private List<PaperInfoVO> timeLimitPaper;

    private List<PaperInfo> pushPaper;
}
