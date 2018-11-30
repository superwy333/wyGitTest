/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-11-30 11:17:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_name` varchar(255) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `deleted` TINYINT(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
