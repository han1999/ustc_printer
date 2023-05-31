/*
 Navicat Premium Data Transfer

 Source Server         : root@192.168.2.11
 Source Server Type    : MySQL
 Source Server Version : 50742 (5.7.42-0ubuntu0.18.04.1)
 Source Host           : 192.168.2.11:3306
 Source Schema         : ustc_printer

 Target Server Type    : MySQL
 Target Server Version : 50742 (5.7.42-0ubuntu0.18.04.1)
 File Encoding         : 65001

 Date: 31/05/2023 21:43:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_address
-- ----------------------------
DROP TABLE IF EXISTS `tb_address`;
CREATE TABLE `tb_address`  (
  `address_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `campus` tinyint(4) NULL DEFAULT NULL,
  `apartment_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `dormitory_id` int(11) NULL DEFAULT NULL,
  `phone_number` char(11) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_itemprice
-- ----------------------------
DROP TABLE IF EXISTS `tb_itemprice`;
CREATE TABLE `tb_itemprice`  (
  `item_id` int(11) NOT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`item_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `print_color` tinyint(4) NULL DEFAULT 0 COMMENT '0-黑白 1-彩色',
  `page_size` tinyint(4) NULL DEFAULT 0 COMMENT '0-A4 1-A3 2-A5',
  `page_numbers` int(11) NULL DEFAULT NULL,
  `delivery_mode` tinyint(4) NULL DEFAULT 0 COMMENT '0-自取 1-配送',
  `delivery_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `status` tinyint(4) NULL DEFAULT 0 COMMENT '待完善',
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `other_demand` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_permission
-- ----------------------------
DROP TABLE IF EXISTS `tb_permission`;
CREATE TABLE `tb_permission`  (
  `permission_id` int(11) NOT NULL,
  `permission_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`permission_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role`  (
  `role_id` int(11) NOT NULL,
  `role_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_role_perm
-- ----------------------------
DROP TABLE IF EXISTS `tb_role_perm`;
CREATE TABLE `tb_role_perm`  (
  `role_perm_id` int(11) NOT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  `perm_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`role_perm_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `qq` char(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `role_id` int(10) NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `is_delete` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
