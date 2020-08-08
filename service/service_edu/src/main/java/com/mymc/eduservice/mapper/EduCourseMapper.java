package com.mymc.eduservice.mapper;

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
}
