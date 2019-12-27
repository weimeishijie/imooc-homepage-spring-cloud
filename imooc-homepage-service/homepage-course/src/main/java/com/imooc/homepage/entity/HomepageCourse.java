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
 * Created by lwy on 2019/12/23.
 * homepageCourse 映射实体表定义
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_course")
public class HomepageCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** 课程名称 */
    @Basic
    @Column(name = "course_name", nullable = false)
    private String courseName;


    /** 课程类型：0（免费课程），1（实战课） */
    @Basic
    @Column(name = "course_type", nullable = false)
    private Integer courseType;

    /** 课程图标 */
    @Basic
    @Column(name = "course_icon", nullable = false)
    private String courseIcon;

    /** 课程介绍 */
    @Basic
    @Column(name = "course_intro", nullable = false)
    private String courseIntro;

    /** 创建时间 */
    @Basic
    @Column(name = "create_time", nullable = false)
    @CreatedDate
    private Date createTime;

    /** 修改时间 */
    @Basic
    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;

    public HomepageCourse(String courseName, Integer courseType,
                          String courseIcon, String courseIntro){
        this.courseName = courseName;
        this.courseType = courseType;
        this.courseIcon = courseIcon;
        this.courseIntro = courseIntro;
    }

    /** 返回一个无效的课程 */
    public static HomepageCourse invalid(){
        HomepageCourse invalid = new HomepageCourse("", 0, "", "");
        invalid.setId(-1L);
        return invalid;
    }


}
