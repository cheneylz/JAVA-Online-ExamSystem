package cn.com.yijuan.configuration.spring.security;

import cn.com.yijuan.base.SystemCode;
import cn.com.yijuan.domain.UserEventLog;
import cn.com.yijuan.event.UserEvent;
import cn.com.yijuan.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author CheneyL
 * 登录成功返回处理器
 */
@Component
@AllArgsConstructor
public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private final ApplicationEventPublisher eventPublisher;
    private final UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        User springUser = (User) authentication.getPrincipal();
        cn.com.yijuan.domain.User user = userService.getUserByUserName(springUser.getUsername());
        UserEventLog userEventLog = new UserEventLog(user.getId(), user.getUserName(), user.getRealName(), new Date());
        userEventLog.setContent(user.getUserName() + " 登录了益卷在线考试系统");
        eventPublisher.publishEvent(new UserEvent(userEventLog));
        cn.com.yijuan.domain.User newUser = new cn.com.yijuan.domain.User();
        newUser.setUserName(user.getUserName());
        newUser.setImagePath(user.getImagePath());
        RestUtil.response(response, SystemCode.OK.getCode(), SystemCode.OK.getMessage(), newUser);
    }
}
