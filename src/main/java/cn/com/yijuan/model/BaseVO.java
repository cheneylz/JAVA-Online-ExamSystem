package cn.com.yijuan.model;

import cn.com.yijuan.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;

/**
 * @author CheneyL
 * 基础显示模型
 */
public class BaseVO {
    protected static ModelMapper modelMapper = ModelMapperSingle.Instance();
}
