package com.mymc.eduservice.service;

import com.mymc.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author mymc
 * @since 2020-08-04
 */
public interface EduVideoService extends IService<EduVideo> {


    //1 根据课程id删除小节
    void removeVideoByCourseId(String courseId);
}
