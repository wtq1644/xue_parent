package com.mymc.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mymc.eduservice.entity.EduSubject;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author mymc
 * @since 2020-08-03
 */
public interface EduSubjectService extends IService<EduSubject> {


    //添加课程分类
    void saveSubject(MultipartFile file, EduSubjectService subjectService);
}
