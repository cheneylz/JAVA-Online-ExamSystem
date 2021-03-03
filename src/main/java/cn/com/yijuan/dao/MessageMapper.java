package cn.com.yijuan.dao;

import cn.com.yijuan.domain.Message;
import cn.com.yijuan.model.admin.message.MessagePageRequestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper extends BaseMapper<Message> {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> page(MessagePageRequestVO requestVO);

    List<Message> selectByIds(List<Integer> ids);

    int readAdd(Integer id);
}
