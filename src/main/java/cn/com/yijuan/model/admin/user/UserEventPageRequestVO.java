package cn.com.yijuan.model.admin.user;

import cn.com.yijuan.base.BasePage;
import lombok.Data;


/**
 * @author CheneyL
 */
@Data
public class UserEventPageRequestVO extends BasePage {

    private Integer userId;

    private String userName;

}
