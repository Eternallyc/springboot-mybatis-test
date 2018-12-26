/*
 Navicat Premium Data Transfer

 Source Server         : Eternally
 Source Server Type    : MySQL
 Source Server Version : 50558
 Source Host           : 127.0.0.1:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 50558
 File Encoding         : 65001

 Date: 26/12/2018 21:51:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userpwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'Eternallyc', '6c975a95d83faec61e6ec1a10d958319');

SET FOREIGN_KEY_CHECKS = 1;
