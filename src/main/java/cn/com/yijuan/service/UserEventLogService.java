package cn.com.yijuan.service;


import cn.com.yijuan.domain.UserEventLog;
import cn.com.yijuan.model.admin.user.UserEventPageRequestVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author CheneyL
 * 用户事件服务类
 */
public interface UserEventLogService extends BaseService<UserEventLog> {

    List<UserEventLog> getUserEventLogByUserId(Integer id);

    PageInfo<UserEventLog> page(UserEventPageRequestVO requestVO);

    List<Integer> selectMothCount();
}
