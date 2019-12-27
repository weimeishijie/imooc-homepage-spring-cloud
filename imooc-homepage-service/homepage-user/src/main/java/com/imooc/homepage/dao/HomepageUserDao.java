package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lwy on 2019/12/24.
 * HomepageUser 数据访问接口定义
 */
public interface HomepageUserDao extends JpaRepository<HomepageUser, Long> {

    /** 通过数据名寻找数据源 */
    HomepageUser findByUsername(String username);

}
