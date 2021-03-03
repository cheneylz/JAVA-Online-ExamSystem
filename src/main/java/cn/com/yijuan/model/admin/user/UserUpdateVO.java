package cn.com.yijuan.model.admin.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;


/**
 * @author CheneyL
 */
@Data
public class UserUpdateVO {

    @NotBlank
    private String realName;

    @NotBlank
    private String phone;

}
