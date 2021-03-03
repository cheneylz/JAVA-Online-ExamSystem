package cn.com.yijuan.model.student.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserUpdateVO {

    @NotBlank
    private String realName;

    private String age;

    private Integer sex;

    private String birthDay;

    private String phone;

    @NotNull
    private Integer userLevel;
}