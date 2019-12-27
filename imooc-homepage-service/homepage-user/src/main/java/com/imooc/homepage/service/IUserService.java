package com.imooc.homepage.service;

import com.imooc.homepage.UserInfo;
import com.imooc.homepage.vo.CreateUserRequest;
import com.imooc.homepage.vo.UserCourseInfo;

/**
 * Created by lwy on 2019/12/24.
 * 用户相关服务接口定义
 */
public interface IUserService {

    /** 创建用户 */
    UserInfo createUser(CreateUserRequest request);

    /** 根据 id 获取用户信息 */
    UserInfo getUserInfo(Long id);

    /** 获取用户和课程信息 */
    UserCourseInfo getUserCourseInfo(Long id);

}
