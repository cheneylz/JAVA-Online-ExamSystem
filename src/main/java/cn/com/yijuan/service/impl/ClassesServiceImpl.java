package cn.com.yijuan.service.impl;

import cn.com.yijuan.dao.ClassesMapper;
import cn.com.yijuan.dao.ClassesUserMapper;
import cn.com.yijuan.domain.Classes;
import cn.com.yijuan.service.ClassesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassesServiceImpl implements ClassesService {

    private final ClassesMapper classesMapper;
    private final ClassesUserMapper classesUserMapper;

    @Override
    public Classes selectById(Integer id) {
        return classesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertByFilter(Classes record) {
        return classesMapper.insertSelective(record);
    }

    @Override
    public int updateByIdFilter(Classes record) {
        return classesMapper.updateByPrimaryKeySelective(record);
    }

}
