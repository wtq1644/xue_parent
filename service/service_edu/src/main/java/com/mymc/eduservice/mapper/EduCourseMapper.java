package com.mymc.eduservice.mapper;

import com.mymc.eduservice.entity.frontvo.CourseWebVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mymc.eduservice.entity.EduCourse;
import com.mymc.eduservice.entity.vo.CoursePublishVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author mymc
 * @since 2020-08-04
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    public CoursePublishVo getPublishCourseInfo(String courseId);

    //根据课程id，编写sql语句查询课程信息
    CourseWebVo getBaseCourseInfo(String courseId);
}
