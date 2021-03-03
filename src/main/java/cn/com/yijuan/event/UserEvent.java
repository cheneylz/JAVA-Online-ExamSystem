package cn.com.yijuan.event;

import cn.com.yijuan.domain.UserEventLog;
import org.springframework.context.ApplicationEvent;

/**
 * @author CheneyL
 * 用户操作事件
 */
public class UserEvent extends ApplicationEvent {

    private final UserEventLog userEventLog;

    public UserEvent(final UserEventLog userEventLog) {
        super(userEventLog);
        this.userEventLog = userEventLog;
    }

    public UserEventLog getUserEventLog() {
        return userEventLog;
    }
}
