package com.imooc.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lwy on 2019/12/24.
 * homepage_user 表示对应的实体类定义
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_user")
public class HomepageUser {


    /** 用户id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 用户名 */
    @Basic
    @Column(name = "username", nullable = false)
    private String username;

    /** 用户邮箱 */
    @Basic
    @Column(name = "email", nullable = false)
    private String email;

    /** 创建时间 */
    @Basic
    @CreatedDate
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /** 更新时间 */
    @Basic
    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;

    public HomepageUser(String username, String email){
        this.username=username;
        this.email = email;
    }

}
