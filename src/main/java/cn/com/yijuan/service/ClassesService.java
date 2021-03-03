package cn.com.yijuan.service;


import cn.com.yijuan.domain.Classes;

/**
 * @author CheneyL
 */
public interface ClassesService {

    Classes selectById(Integer id);

    int insertByFilter(Classes record);

    int updateByIdFilter(Classes record);


}
