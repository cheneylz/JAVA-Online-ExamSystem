package cn.com.yijuan.model.admin.education;

import cn.com.yijuan.model.BaseVO;
import lombok.Data;

/**
 * @author CheneyL
 */
@Data
public class SubjectResponseVO extends BaseVO {
    private Integer id;

    private String name;

    private Integer level;

    private String levelName;
}
