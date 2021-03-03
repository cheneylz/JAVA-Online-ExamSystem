package cn.com.yijuan.service;


import cn.com.yijuan.domain.Subject;
import cn.com.yijuan.model.admin.education.SubjectPageRequestVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author CheneyL
 */
public interface SubjectService extends BaseService<Subject> {

    List<Subject> getSubjectByLevel(Integer level);

    List<Subject> allSubject();

    Integer levelBySubjectId(Integer id);

    PageInfo<Subject> page(SubjectPageRequestVO requestVO);
}
