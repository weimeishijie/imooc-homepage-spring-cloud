package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lwy on 2019/12/24.
 * HomepageUserCourse 数据访问接口定义
 */
public interface HomepageUserCourseDao extends JpaRepository<HomepageUserCourse, Long> {

    /** 通过用户 id 寻找记录数据 */
    List<HomepageUserCourse>  findAllByUserId(Long userId);

}
