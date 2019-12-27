package com.imooc.homepage.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * Created by lwy on 2019/12/24.
 * 创建用户请求对象定义
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    private String username;
    private String email;

    /** 请求有效性验证 */
    public boolean validate(){
        return StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(email);
    }



}
