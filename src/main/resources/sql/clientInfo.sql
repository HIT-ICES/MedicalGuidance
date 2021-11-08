CREATE DATABASE IF NOT EXISTS `medicine`;
USE  `medicine`;

CREATE TABLE `patientInfo` (
    `userid` INTEGER NOT NULL AUTO_INCREMENT COMMENT '用户的id，主键自增',
    `name` varchar(100) NOT NULL COMMENT '服务名称',
    `version` varchar(100) NOT NULL COMMENT '版本号',
    `branch` varchar(10) not null COMMENT '分支',
    `image` varchar(100) COMMENT '镜像地址',
    `port` integer  NOT NULL COMMENT '端口号',
    `basePath` varchar(100) NOT NULL COMMENT 'git仓库地址',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `doctor` (

) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table `illNess` (

) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table `Diagnosis` (

) ENGINE=InnoDB DEFAULT CHARSET=utf8;