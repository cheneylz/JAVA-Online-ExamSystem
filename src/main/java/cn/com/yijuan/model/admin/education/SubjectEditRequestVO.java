package cn.com.yijuan.model.admin.education;

import cn.com.yijuan.model.BaseVO;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author CheneyL
 */
@Data
public class SubjectEditRequestVO extends BaseVO {

    private Integer id;

    @NotBlank
    private String name;

    @NotNull
    private Integer level;

    @NotBlank
    private String levelName;

}
