package cn.com.yijuan.base;

import cn.com.yijuan.context.WebContext;
import cn.com.yijuan.domain.User;
import cn.com.yijuan.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author CheneyL
 * 基础Web接口
 */
public class BaseApiController {

    protected final static String DEFAULT_PAGE_SIZE = "10";
    protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();

    @Autowired
    protected WebContext webContext;

    protected User getCurrentUser() {
        return webContext.getCurrentUser();
    }

}
