package com.imooc.homepage.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;
import com.imooc.homepage.service.ICourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lwy on 2019/12/24.
 * 课程对外服务接口
 */
@Slf4j
@RestController
public class HomepageCourseController {

    /** 课程服务接口 */
    private final ICourseService courseService;

    @Autowired
    public HomepageCourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * 127.0.0.1:7001/homepage-course/get/course?id=
     * 127.0.0.1:9000/imooc/homepage-course/get/course?id=
     * */
    @GetMapping("/get/course")
    public CourseInfo getCourseInfo(long id){
        log.info("<homepage-course>: get course -> {}", id);
        return courseService.getCourseInfo(id);
    }

    @RequestMapping("/get/courses")
    public List<CourseInfo> getCourseInfos(@RequestBody CourseInfosRequest request){
        log.info("<homepage-course>: get course -> {}", JSON.toJSONString(request));
        return courseService.getCourseInfos(request);
    }

}
