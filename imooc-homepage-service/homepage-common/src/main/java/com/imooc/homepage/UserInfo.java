package com.imooc.homepage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lwy on 2019/12/23.
 * 基本的用户信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private Long id;
    private String username;
    private String email;

    public static UserInfo invalid(){
        return new UserInfo(-1L,"","");
    }

}
