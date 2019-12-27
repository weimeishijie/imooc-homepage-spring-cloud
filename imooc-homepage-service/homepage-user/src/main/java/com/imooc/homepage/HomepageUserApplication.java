package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by lwy on 2019/12/24.
 * 用户服务启动入口
 * 注解 EnableCircuitBreaker 是程序具有熔断功能
 * 注解 EnableFeignClients
 * */
@EnableJpaAuditing
@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class HomepageUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomepageUserApplication.class, args);
    }



}
