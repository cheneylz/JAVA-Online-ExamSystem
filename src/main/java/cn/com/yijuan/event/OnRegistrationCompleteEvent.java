package cn.com.yijuan.event;

import cn.com.yijuan.domain.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author CheneyL
 * 注册事件
 */
public class OnRegistrationCompleteEvent extends ApplicationEvent {


    private final User user;


    public OnRegistrationCompleteEvent(final User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}