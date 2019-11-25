/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 25/09/2019 14:54:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dictionary
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` varchar(20) NOT NULL COMMENT '字典类型',
  `name` varchar(100) NOT NULL COMMENT '字典名称',
  `code` varchar(100) NOT NULL COMMENT '代码证',
  `item_order` varchar(3) NOT NULL COMMENT '排序',
  `status` int(1) NOT NULL COMMENT '状态 0无效 1有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionary
-- ----------------------------
BEGIN;
INSERT INTO `dictionary` VALUES (1, 'sex', '男', '1', '1', 1);
INSERT INTO `dictionary` VALUES (2, 'sex', '女', '0', '2', 1);
INSERT INTO `dictionary` VALUES (3, 'sex', '未知', '2', '3', 1);
INSERT INTO `dictionary` VALUES (4, 'car', '奔驰', '0', '1', 1);
INSERT INTO `dictionary` VALUES (5, 'car', '宝马', '1', '2', 1);
INSERT INTO `dictionary` VALUES (6, 'car', '奥迪', '2', '3', 1);
INSERT INTO `dictionary` VALUES (7, 'phone', '苹果', '1', '2', 1);
INSERT INTO `dictionary` VALUES (8, 'phone', '华为', '0', '1', 1);
INSERT INTO `dictionary` VALUES (9, 'phone', '小米', '2', '3', 1);
INSERT INTO `dictionary` VALUES (10, 'clothes', '耐克', '1', '2', 1);
INSERT INTO `dictionary` VALUES (11, 'clothes', '安踏', '0', '1', 1);
INSERT INTO `dictionary` VALUES (12, 'clothes', '阿迪达斯', '2', '3', 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
