package com.imooc.homepage.service;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;

import java.util.List;

/**
 * Created by lwy on 2019/12/24.
 * 课程相关服务接口定义
 */
public interface ICourseService {

    /** 通过 id 获取课程信息 */
    CourseInfo getCourseInfo(Long id);

    /** 通过 ids 获取课程信息 */
    List<CourseInfo> getCourseInfos(CourseInfosRequest request);

}
