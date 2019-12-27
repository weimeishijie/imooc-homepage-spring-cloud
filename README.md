# spring cloud 项目搭建

## 项目介绍
- 实现一个页面中用户与课程模块的微服务
- 项目集成了 **eureka** **zuul** **feign** **Hystrix**
- 项目采用 *多模块* *编码设计* *服务拆分*功能
- 运用java8的新特性技术
## 集成模块功能介绍
- **EUREKA**：主要用于服务注册于服务发现；是 springCloud 组件中最重要最核心的组件之一；*eureka* 包含两个组件 *Eureka Server* 和 *Eureka Client*；通常 *Eureka Server* 简称为：*Eureka*；*Eureka Client* 简称为：*微服务*
- **ZUUL**：是一个 API Gateway 服务器，本质上是一个 WebServlet 应用；功能实现主要核心是一系列的过滤器（filter）
- **FEIGN**：用微为服务与微服务之间的通讯并且 feign 整合了 Hystrix 实现熔断降级的功能
- **HYSTRIX**：Hystrix有三个特性：熔断器机制、Fallback、资源隔离

## 父项目搭建
1. 此项目的项目名为 jinan-homepage-spring-cloud
2. 引用模块参考项目文件下的pom.xml文件
3. 注意：项目中引用的 spring-boot-starter-parent 与 spring-cloud-dependencies 版本是由对象关系的；与此项目版本不同可参考官方文档去找对应版本
4. 注意：父项目文件打包方式为 pom

## EUREKA 的集成
1. 创建 eureka 子项目，这里项目名字为：homepage-eureka
2. 所用依赖参考项目的pom.xml文件
3. 单节点的注册服务配置参考 application.yml 文件
4. 多节点的eureka服务注册配置参考 bootstrap.yml 文件
5. 在 springBoot 中配置文件的启动时加载的模式可以参考官方文档
https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/html/spring-boot-features.html#boot-features-external-config-application-property-files
## ZUUL 的集成
1. 创建 zuul 子项目，这里项目名字为：homepage-zuul
2. 所用依赖参考项目的pom.xml文件
3. zuul 配置参考 application.yml 文件
## 微服务的构建
1. 此项目中构建父项目 jinan-homepage-service
2. 三个子项目模块 homepage-common、homepage-course、homepage-user
3. homepage-common 存放项目间公用代码
4. homepage-course 针对课程表开发实现的课程服务模块
5. homepage-user 针对用户表及与课程关系表创建的人员服务模块

## 项目的使用
### 1.在数据表中（mysql）建立数据库及数据表 建表方式以及字段在doc文件夹下
### 2.将项目homepage-eureka、homepage-zuul、homepage-course、homepage-user同时运行
### 3.运行稳定后访问接口
#### 3.1 微服务接口（根据ID获取 用户 信息）：127.0.0.1:7000/homepage-user/get/user?id=1
#### 3.2 微服务接口（根据用户ID获取 用户和关联课程 信息）：127.0.0.1:7000/homepage-user/get/user/course?id=1
#### 3.3 微服务接口（创建一个用户 post请求 json中包含username和email属性）:127.0.0.1:7000/homepage-user/create/user
#### 3.4 微服务接口（根据ID获取课程信息）：127.0.0.1:7001/homepage-course/get/course?id=1
#### 3.5 微服务接口（根据多个ID获取课程信息 post请求 json中含有一个ids属性）：127.0.0.1:7001/homepage-course/get/courses

#### 3.6 zuul管理接口（根据ID获取用户信息）：127.0.0.1:9000/jinan/homepage-user/get/user?id=1
#### 3.6 zuul管理接口（根据用户ID获取用户和关联课程信息）127.0.0.1:9000/jinan/homepage-user/get/user/course?id=1
#### 3.8 zuul管理接口（创建一个用户post请求 json中包含username/email字段）：127.0.0.1:9000/jinan/homepage-user/create/user
#### 3.9 zuul管理接口（根据ID获取 课程 信息）：127.0.0.1:9000/jinan/homepage-course/get/course?id=1
#### 3.10 .zuul管理接口（根据多个ID获取课程信息 post请求 json中含有一个ids属性）：127.0.0.1:9000/jinan/homepage-course/get/courses
