package cn.com.yijuan.model.admin.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;


/**
 * @author CheneyL
 */
@Data
public class UserCreateVO {

    private Integer id;

    @NotBlank
    private String userName;

    private String password;

    @NotBlank
    private String realName;

    private String age;

    private Integer status;

    private Integer sex;

    private String birthDay;

    private String phone;

    private Integer role;

    private Integer userLevel;
}
