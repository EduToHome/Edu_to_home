/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - edu_to_home
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`edu_to_home` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `edu_to_home`;

/*Table structure for table `class` */

DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
  `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '班级编号',
  `cname` varchar(20) NOT NULL COMMENT '班级名称',
  `cdesc` varchar(50) DEFAULT NULL COMMENT '班级简介',
  `tid` int(11) NOT NULL COMMENT '班主任编号',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class` */

/*Table structure for table `class_sub` */

DROP TABLE IF EXISTS `class_sub`;

CREATE TABLE `class_sub` (
  `csid` int(11) NOT NULL AUTO_INCREMENT COMMENT '班级科目编号',
  `cid` int(11) NOT NULL COMMENT '班级编号',
  `suid` int(11) NOT NULL COMMENT '科目编号',
  `tid` int(11) NOT NULL COMMENT '老师编号',
  PRIMARY KEY (`csid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class_sub` */

/*Table structure for table `content` */

DROP TABLE IF EXISTS `content`;

CREATE TABLE `content` (
  `coid` int(11) NOT NULL AUTO_INCREMENT COMMENT '试卷内容编号',
  `teid` int(11) NOT NULL COMMENT '所属试卷编号',
  `topic` int(11) NOT NULL COMMENT '题目编号',
  PRIMARY KEY (`coid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `content` */

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `mid` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言板编号',
  `send-uid` varchar(20) NOT NULL COMMENT '发件人',
  `receive-uid` varchar(20) NOT NULL COMMENT '收件人',
  `mdesc` varchar(50) DEFAULT NULL COMMENT '留言内容',
  `mdate` varchar(50) DEFAULT NULL COMMENT '留言时间',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message` */

/*Table structure for table `parent` */

DROP TABLE IF EXISTS `parent`;

CREATE TABLE `parent` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '家长编号',
  `uid` int(11) NOT NULL COMMENT '用户编号',
  `paddrs` varchar(50) DEFAULT NULL COMMENT '家庭地址',
  `pdesc` varchar(50) DEFAULT NULL COMMENT '家长简介',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `parent` */

/*Table structure for table `roles` */

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `rname` varchar(20) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `roles` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `sname` varchar(20) NOT NULL COMMENT '学生姓名',
  `sex` varchar(20) DEFAULT NULL COMMENT '学生性别',
  `cid` int(11) NOT NULL COMMENT '班级编号',
  `uid` int(11) NOT NULL COMMENT '用户编号',
  `pid` int(11) NOT NULL COMMENT '家长编号',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

/*Table structure for table `student_content` */

DROP TABLE IF EXISTS `student_content`;

CREATE TABLE `student_content` (
  `scid` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生答题后试卷内容编号',
  `stid` int(11) NOT NULL COMMENT '学生编号',
  `topic` varchar(255) NOT NULL COMMENT '考试题目',
  `answer` varchar(255) NOT NULL COMMENT '题目答案',
  PRIMARY KEY (`scid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_content` */

/*Table structure for table `student_test` */

DROP TABLE IF EXISTS `student_test`;

CREATE TABLE `student_test` (
  `stid` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生试卷编号',
  `sid` int(11) NOT NULL COMMENT '学生编号',
  `teid` int(11) NOT NULL COMMENT '试卷编号',
  `cid` int(11) NOT NULL COMMENT '班级编号',
  `state` int(11) NOT NULL COMMENT '答题状态',
  `score` int(11) DEFAULT NULL COMMENT '成绩',
  `sumsid` int(11) DEFAULT NULL COMMENT '成绩表编号',
  PRIMARY KEY (`stid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_test` */

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `suid` int(11) NOT NULL AUTO_INCREMENT,
  `suname` varchar(20) NOT NULL,
  `sudesc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`suid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `subject` */

/*Table structure for table `sum_score` */

DROP TABLE IF EXISTS `sum_score`;

CREATE TABLE `sum_score` (
  `sumsid` int(11) NOT NULL AUTO_INCREMENT COMMENT '总成绩表编号',
  `sid` int(11) NOT NULL COMMENT '学生编号',
  `cid` int(11) NOT NULL COMMENT '班级编号',
  `ttid` int(11) NOT NULL COMMENT '考试类型编号',
  `sum_score` int(11) NOT NULL COMMENT '总成绩',
  PRIMARY KEY (`sumsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sum_score` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT COMMENT '老师编号',
  `suid` int(11) NOT NULL COMMENT '科目编号',
  `uid` int(11) NOT NULL COMMENT '用户编号',
  `tedu` varchar(20) DEFAULT NULL COMMENT '学历',
  `tdesc` varchar(50) DEFAULT NULL COMMENT '老师简介',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `teid` int(11) NOT NULL AUTO_INCREMENT COMMENT '试卷编号',
  `ttid` int(11) NOT NULL COMMENT '考试类型编号',
  `suid` int(11) NOT NULL COMMENT '科目编号',
  `tid` int(11) NOT NULL COMMENT '出题老师编号',
  PRIMARY KEY (`teid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `test` */

/*Table structure for table `test_type` */

DROP TABLE IF EXISTS `test_type`;

CREATE TABLE `test_type` (
  `ttid` int(11) NOT NULL AUTO_INCREMENT,
  `ttname` varchar(50) NOT NULL,
  PRIMARY KEY (`ttid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `test_type` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `rid` int(11) NOT NULL COMMENT '角色编号',
  `username` varchar(20) NOT NULL COMMENT '用户姓名',
  `password` varchar(20) DEFAULT NULL COMMENT '用户密码',
  `tell` varchar(11) DEFAULT NULL COMMENT '用户电话',
  `email` varchar(20) DEFAULT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
