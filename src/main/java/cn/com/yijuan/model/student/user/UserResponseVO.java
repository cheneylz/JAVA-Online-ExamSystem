package cn.com.yijuan.model.student.user;

import cn.com.yijuan.domain.User;
import cn.com.yijuan.model.BaseVO;
import cn.com.yijuan.utility.DateTimeUtil;
import lombok.Data;

/**
 * @author alvis
 */

@Data
public class UserResponseVO extends BaseVO {

    private Integer id;

    private String userUuid;

    private String userName;

    private String realName;

    private Integer age;

    private Integer role;

    private Integer sex;

    private String birthDay;

    private String phone;

    private String lastActiveTime;

    private String createTime;

    private String modifyTime;

    private Integer status;

    private Integer userLevel;

    private String imagePath;

    public static UserResponseVO from(User user) {
        UserResponseVO vm = modelMapper.map(user, UserResponseVO.class);
        vm.setBirthDay(DateTimeUtil.dateFormat(user.getBirthDay()));
        vm.setLastActiveTime(DateTimeUtil.dateFormat(user.getLastActiveTime()));
        vm.setCreateTime(DateTimeUtil.dateFormat(user.getCreateTime()));
        vm.setModifyTime(DateTimeUtil.dateFormat(user.getModifyTime()));
        return vm;
    }
}
