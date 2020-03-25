/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ccc

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-03-25 20:49:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `c_tt`
-- ----------------------------
DROP TABLE IF EXISTS `c_tt`;
CREATE TABLE `c_tt` (
  `id` mediumint(20) NOT NULL AUTO_INCREMENT,
  `text` varchar(40) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_tt
-- ----------------------------
INSERT INTO `c_tt` VALUES ('1', 'C', '200');
INSERT INTO `c_tt` VALUES ('2', 'Cddd', '2123dfd');
INSERT INTO `c_tt` VALUES ('3', '小六', 'kdd2');
INSERT INTO `c_tt` VALUES ('4', 'ffdsf', 'aaaaa');
INSERT INTO `c_tt` VALUES ('5', 'ffdsf2', 'xiexiaomao');
INSERT INTO `c_tt` VALUES ('6', 'ffdsf2', 'aaaaa');
INSERT INTO `c_tt` VALUES ('7', 'ffdsf2', 'aaaaa');
INSERT INTO `c_tt` VALUES ('8', 'ffdsf2', 'aaaaa');
INSERT INTO `c_tt` VALUES ('10', '王五', '烧饼');

-- ----------------------------
-- Table structure for `c_user`
-- ----------------------------
DROP TABLE IF EXISTS `c_user`;
CREATE TABLE `c_user` (
  `id` mediumint(20) NOT NULL AUTO_INCREMENT,
  `username` char(30) NOT NULL,
  `password` char(50) NOT NULL,
  `sex` char(3) DEFAULT '保密',
  `mobile` char(20) DEFAULT NULL,
  `creatdate` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_user
-- ----------------------------
INSERT INTO `c_user` VALUES ('1', 'yige142', '123123', '保密', '13123232131', '12312312312312312312');
INSERT INTO `c_user` VALUES ('2', '22', '123', '1', '1', '11');
INSERT INTO `c_user` VALUES ('3', 'yige143', '4297f44b13955235245b2497399d7a93', '男', '123123', '1583327548608');
INSERT INTO `c_user` VALUES ('4', 'yige144', '4297f44b13955235245b2497399d7a93', '男', '1312321231', '1583328505809');
INSERT INTO `c_user` VALUES ('5', 'yige12', '4297f44b13955235245b2497399d7a93', '男', '123123', '1583329597148');
INSERT INTO `c_user` VALUES ('6', 'sdf', '4297f44b13955235245b2497399d7a93', '男', '1312321231', '1583329849155');

-- ----------------------------
-- Table structure for `employ`
-- ----------------------------
DROP TABLE IF EXISTS `employ`;
CREATE TABLE `employ` (
  `id` mediumint(10) NOT NULL AUTO_INCREMENT,
  `name` char(20) NOT NULL,
  `department` char(30) NOT NULL,
  `sex` char(3) DEFAULT NULL,
  `intodate` char(20) DEFAULT NULL,
  `intro` char(200) DEFAULT '个人介绍',
  `creatdate` char(20) DEFAULT NULL COMMENT '创建时间',
  `img` char(220) DEFAULT NULL COMMENT '存头像',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employ
-- ----------------------------
INSERT INTO `employ` VALUES ('1', '小毛', '总经办', '男', '2020-02-03', '个人介绍', null, null);
INSERT INTO `employ` VALUES ('2', 'sdf', '0', '女', null, 'zzz', null, null);

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `order_id` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '2020301232132132');
