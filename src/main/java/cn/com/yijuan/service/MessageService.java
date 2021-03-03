package cn.com.yijuan.service;


import cn.com.yijuan.domain.Message;
import cn.com.yijuan.domain.MessageUser;
import cn.com.yijuan.model.admin.message.MessagePageRequestVO;
import cn.com.yijuan.model.student.user.MessageRequestVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author CheneyL
 */
public interface MessageService {

    List<Message> selectMessageByIds(List<Integer> ids);

    PageInfo<MessageUser> studentPage(MessageRequestVO requestVO);

    PageInfo<Message> page(MessagePageRequestVO requestVM);

    List<MessageUser> selectByMessageIds(List<Integer> ids);

    void sendMessage(Message message, List<MessageUser> messageUsers);

    void read(Integer id);

    Integer unReadCount(Integer userId);

    Message messageDetail(Integer id);
}
