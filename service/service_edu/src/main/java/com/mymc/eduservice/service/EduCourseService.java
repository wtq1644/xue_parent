package com.mymc.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mymc.eduservice.entity.EduCourse;
import com.mymc.eduservice.entity.vo.CourseInfoVo;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author mymc
 * @since 2020-08-04
 */
public interface EduCourseService extends IService<EduCourse> {

    //添加课程基本信息的方法
    String saveCourseInfo(CourseInfoVo courseInfoVo);

}
