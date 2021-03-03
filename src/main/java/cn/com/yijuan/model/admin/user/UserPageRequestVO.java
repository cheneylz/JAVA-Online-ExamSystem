package cn.com.yijuan.model.admin.user;

import cn.com.yijuan.base.BasePage;
import lombok.Data;


/**
 * @author CheneyL
 */
@Data
public class UserPageRequestVO extends BasePage {

    private String userName;

    private Integer role;

}
