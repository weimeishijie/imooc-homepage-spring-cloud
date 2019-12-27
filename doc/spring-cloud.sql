CREATE DATABASE /*!32312 IF NOT EXISTS*/`imooc_homepage_sc`

USE `imooc_homepage_sc`;

DROP TABLE IF EXISTS `homepage_course`;

CREATE TABLE `homepage_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `course_name` varchar(128) DEFAULT NULL COMMENT '课程名称，唯一索引',
  `course_type` varchar(128) DEFAULT NULL COMMENT '课程类型',
  `course_icon` varchar(128) DEFAULT NULL COMMENT '课程图标',
  `course_intro` varchar(128) DEFAULT NULL COMMENT '课程介绍',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQUE` (`course_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert  into `homepage_course`(`id`,`course_name`,`course_type`,`course_icon`,`course_intro`,`create_time`,`update_time`) values (1,'JDK11&12 新特性解读','0','https://www.imooc.com','解读 JDK11 和 JDK12 的新版本特性','2019-12-24 09:57:37','2019-12-24 09:57:37'),(2,'基于 SpringCloud 为服务架构 广告系统设计与实现','1','https://www.imooc.com','广告系统设计与实现','2019-12-24 09:57:37','2019-12-24 09:57:37');


DROP TABLE IF EXISTS `homepage_user`;

CREATE TABLE `homepage_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `username` varchar(128) DEFAULT NULL COMMENT '用户名，唯一索引',
  `email` varchar(128) DEFAULT NULL COMMENT '用户邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

insert  into `homepage_user`(`id`,`username`,`email`,`create_time`,`update_time`) values (1,'qinyi','qingyi@imooc.com','2019-12-24 11:50:13','2019-12-24 11:50:13');


DROP TABLE IF EXISTS `homepage_user_course`;

CREATE TABLE `homepage_user_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `course_id` bigint(20) DEFAULT NULL COMMENT '课程id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQUE` (`user_id`,`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


insert  into `homepage_user_course`(`id`,`user_id`,`course_id`,`create_time`,`update_time`) values (1,1,1,'2019-12-24 11:58:41','2019-12-24 11:58:41'),(2,1,2,'2019-12-24 11:58:41','2019-12-24 11:58:41');
