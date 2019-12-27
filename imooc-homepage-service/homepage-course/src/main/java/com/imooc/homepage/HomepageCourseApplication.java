package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/**
 * Created by lwy on 2019/12/23.
 * springBoot 启动入口
 * 注解：EnableJpaAuditing 自动填充创建时间与更新时间
 * 与 注解 @EntityListeners(AuditingEntityListener.class)
 * 和 注解 @CreatedDate（创建时间）、@LastModifiedDate（修改时间） 一起使用
 */
@EnableJpaAuditing
@EnableEurekaClient
@SpringBootApplication
public class HomepageCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomepageCourseApplication.class, args);
    }

}
