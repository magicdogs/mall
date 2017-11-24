/*
Navicat MySQL Data Transfer

Source Server         : 192.168.99.100_32769
Source Server Version : 50716
Source Host           : 192.168.99.100:32769
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-11-24 16:13:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mall_address
-- ----------------------------
DROP TABLE IF EXISTS `mall_address`;
CREATE TABLE `mall_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `is_default` int(11) DEFAULT NULL COMMENT '是否默认',
  `region` varchar(100) DEFAULT NULL COMMENT '地区',
  `contacts` varchar(30) DEFAULT NULL COMMENT '联系人',
  `code` varchar(12) DEFAULT NULL COMMENT '邮编',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `add_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '增加时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_address
-- ----------------------------

-- ----------------------------
-- Table structure for mall_banner
-- ----------------------------
DROP TABLE IF EXISTS `mall_banner`;
CREATE TABLE `mall_banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `business_id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `link_url` varchar(255) DEFAULT NULL,
  `paixu` int(11) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `status_str` varchar(255) DEFAULT NULL,
  `date_add` datetime DEFAULT NULL,
  `date_update` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_banner
-- ----------------------------
INSERT INTO `mall_banner` VALUES ('1', null, null, null, null, null, '0', 'https://cdn.it120.cc/apifactory/2017/04/23/ddba8b8438f5163144f340ef400a90a7.jpg', null, '0', '隐藏', null, '2017-11-24 04:32:20');
INSERT INTO `mall_banner` VALUES ('2', null, null, null, null, null, '0', 'https://cdn.it120.cc/apifactory/2017/04/23/b93e2e307ec6695d258cb72143af0d54.jpg', null, '0', '显示', null, '2017-11-24 06:45:17');
INSERT INTO `mall_banner` VALUES ('3', null, null, null, null, null, '0', 'https://cdn.it120.cc/apifactory/2017/04/23/6aa1e03d895ad64014c034e555d28a97.jpg', null, '0', '显示', null, '2017-11-24 06:45:18');

-- ----------------------------
-- Table structure for mall_category
-- ----------------------------
DROP TABLE IF EXISTS `mall_category`;
CREATE TABLE `mall_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `key` varchar(255) DEFAULT NULL COMMENT '关键字',
  `level` int(11) DEFAULT NULL COMMENT '级别 0 为根',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `icon` varchar(255) DEFAULT NULL COMMENT '图标地址',
  `paixu` int(255) DEFAULT NULL COMMENT '排序',
  `pid` int(11) DEFAULT NULL COMMENT 'parentId',
  `type` varchar(255) DEFAULT '' COMMENT '分类类别',
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `date_add` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `is_use` varchar(10) DEFAULT NULL COMMENT '是否使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_category
-- ----------------------------
INSERT INTO `mall_category` VALUES ('1', null, '1', '彩妆香氛', 'https://cdn.it120.cc/apifactory/2017/04/23/dcbc320d330a3057e46879598f336da7.jpg', null, '0', '', null, '2017-11-24 06:41:59', null);
INSERT INTO `mall_category` VALUES ('2', null, '1', '小黑瓶家', 'https://cdn.it120.cc/apifactory/2017/04/23/d3d2c6e15e21b8cb6a7bbeabd4da5242.jpg', null, '0', '', null, '2017-11-24 06:42:00', null);
INSERT INTO `mall_category` VALUES ('3', null, '1', '护肤', 'https://cdn.it120.cc/apifactory/2017/04/23/dad06a09c5ed85b874055d33ba7e312a.jpg', null, '0', '', null, '2017-11-24 06:42:01', null);

-- ----------------------------
-- Table structure for mall_config
-- ----------------------------
DROP TABLE IF EXISTS `mall_config`;
CREATE TABLE `mall_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `date_type` int(11) DEFAULT NULL COMMENT '类型',
  `key` varchar(255) DEFAULT NULL COMMENT 'key值',
  `value` varchar(255) DEFAULT NULL COMMENT 'value值',
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `creat_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_config
-- ----------------------------
INSERT INTO `mall_config` VALUES ('9', '0', 'mallName', 'symagics商城', null, '商城名称', '2017-11-24 12:25:49', '2017-11-24 04:26:30');

-- ----------------------------
-- Table structure for mall_coupons
-- ----------------------------
DROP TABLE IF EXISTS `mall_coupons`;
CREATE TABLE `mall_coupons` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_add` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `date_end_days` int(11) DEFAULT NULL,
  `date_end_type` int(11) DEFAULT NULL,
  `date_start_type` int(11) DEFAULT NULL,
  `money_hreshold` varchar(255) DEFAULT NULL,
  `money_max` varchar(255) DEFAULT NULL,
  `money_min` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `need_score` varchar(255) DEFAULT NULL,
  `number_git` int(11) DEFAULT NULL,
  `number_git_number` int(11) DEFAULT NULL,
  `number_left` int(11) DEFAULT NULL,
  `number_person_max` int(11) DEFAULT NULL,
  `number_totle` int(11) DEFAULT NULL,
  `number_used` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `status_str` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_coupons
-- ----------------------------

-- ----------------------------
-- Table structure for mall_goods
-- ----------------------------
DROP TABLE IF EXISTS `mall_goods`;
CREATE TABLE `mall_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `bar_code` varchar(255) DEFAULT NULL COMMENT '未知',
  `category_id` int(11) DEFAULT NULL COMMENT '类别ID',
  `characteristic` varchar(255) DEFAULT NULL,
  `commission` int(11) DEFAULT NULL,
  `commission_type` int(255) DEFAULT NULL,
  `date_add` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `date_start` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `date_update` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `logistics_id` int(11) DEFAULT NULL,
  `min_price` int(11) DEFAULT NULL COMMENT '折扣价',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `number_fav` int(11) DEFAULT NULL,
  `number_good_reputation` int(11) DEFAULT NULL,
  `number_orders` int(11) DEFAULT NULL,
  `original_price` int(11) DEFAULT NULL COMMENT '原价',
  `paixu` int(11) DEFAULT NULL COMMENT '排序',
  `pic` varchar(255) DEFAULT NULL COMMENT '图片',
  `property_ids` varchar(255) DEFAULT NULL,
  `recommend_status` int(11) DEFAULT NULL,
  `recommend_status_str` varchar(255) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `status_str` varchar(255) DEFAULT NULL,
  `stores` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `views` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_goods
-- ----------------------------
INSERT INTO `mall_goods` VALUES ('1', null, '0', '补差价，勿拍', null, null, '2017-11-24 06:53:34', '2017-11-24 06:53:34', '2017-11-24 06:53:34', null, '1', '补差价', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/05/22/bdc9c374db9a236edae5b9c6340bf296.jpeg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('2', null, '1', null, null, null, '2017-11-24 06:53:36', '2017-11-24 06:53:36', '2017-11-24 06:53:36', null, '58', '兰蔻「小黑瓶」精华肌底眼部凝霜眼霜15ml 眼膜霜 淡化细纹黑眼圈', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/26/a91ca6e8a3b73163664ef39eb8237d76.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('3', null, '2', null, null, null, '2017-11-24 06:53:37', '2017-11-24 06:53:37', '2017-11-24 06:53:37', null, '78', '兰蔻 净透洁面泡沫洗面奶125ml 温和起泡保湿毛孔深层清洁 正品', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/26/323c7d5a278f8f3c51d3f25841e8987e.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('4', null, '3', null, null, null, '2017-11-24 06:53:38', '2017-11-24 06:53:38', '2017-11-24 06:53:38', null, '128', '兰蔻 水份缘舒缓凝霜50ml 补水保湿滋润修护面霜日霜专柜正品', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/26/035873b5e43912b80e4023bd7a7402db.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('5', null, '3', null, null, null, '2017-11-24 06:53:39', '2017-11-24 06:53:39', '2017-11-24 06:53:39', null, '328', '兰蔻 梦魅旋密睫毛膏01 6.5g 持久卷翘浓密防晕染温和易卸', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/26/b6a373eb559d1debaaa5124ddce61381.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('6', null, '2', null, null, null, '2017-11-24 06:53:39', '2017-11-24 06:53:39', '2017-11-24 06:53:39', null, '228', '兰蔻 「小黑瓶」全规格精华肌底液 面部精华直达肌底补水保湿弹润', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/23/ecfbe78897c0ee9ee138a60f3ea407f9.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('7', null, '1', null, null, null, '2017-11-24 06:53:40', '2017-11-24 06:53:40', '2017-11-24 06:53:40', null, '78', '兰蔻 菁纯柔润唇膏 天猫专属色口红 317/379 西柚粉荧光粉', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/23/25042836c1ba99590d98d9ee0bc42371.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('8', null, '1', null, null, null, '2017-11-24 06:53:41', '2017-11-24 06:53:41', '2017-11-24 06:53:41', null, '98', '兰蔻 卸妆水清滢速洁眼部卸妆水200ml 不含酒精温和眼唇卸', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/23/ee762147d0adff7d75e9eb8ef93d8c1d.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('9', null, '2', null, null, null, '2017-11-24 06:53:42', '2017-11-24 06:53:42', '2017-11-24 06:53:42', null, '168', '兰蔻 轻气垫CC霜修颜隔离乳 保湿清爽遮瑕防晒提亮肤色裸妆', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/23/a39987618efe93b807301435a96b2418.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('10', null, '3', null, null, null, '2017-11-24 06:53:42', '2017-11-24 06:53:42', '2017-11-24 06:53:42', null, '198', '兰蔻新根源补养洁颜啫喱', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/04/49e2d713e88e53fd9d8481367125d3da.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('11', null, '2', null, null, null, '2017-11-24 06:53:43', '2017-11-24 06:53:43', '2017-11-24 06:53:43', null, '588', '兰蔻立体塑颜紧致晚霜', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/04/6c9e28175b1adccb9354e64ce151960b.jpg', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `mall_goods` VALUES ('12', null, '1', null, null, null, '2017-11-24 06:53:45', '2017-11-24 06:53:45', '2017-11-24 06:53:45', null, '328', '兰蔻小黑瓶精华肌底液', null, null, null, null, null, 'https://cdn.it120.cc/apifactory/2017/04/04/6a7af6c25973e338c027827b8134da90.png', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for mall_notice
-- ----------------------------
DROP TABLE IF EXISTS `mall_notice`;
CREATE TABLE `mall_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `is_show` varchar(10) DEFAULT NULL COMMENT '显示和隐藏',
  `date_add` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_notice
-- ----------------------------
INSERT INTO `mall_notice` VALUES ('1', '本商城', null, 'true', '2017-11-24 06:44:17');
INSERT INTO `mall_notice` VALUES ('2', '免费开源', null, 'true', '2017-11-24 06:44:18');
INSERT INTO `mall_notice` VALUES ('3', '源码搭建', null, 'true', '2017-11-24 06:44:20');

-- ----------------------------
-- Table structure for mall_users
-- ----------------------------
DROP TABLE IF EXISTS `mall_users`;
CREATE TABLE `mall_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `mobile` varchar(255) DEFAULT NULL COMMENT '用户手机号',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `token` varchar(255) DEFAULT NULL COMMENT 'token',
  `privince` varchar(50) DEFAULT NULL COMMENT '省份',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `source` int(11) DEFAULT NULL COMMENT '注册来源',
  `face` varchar(255) DEFAULT NULL COMMENT '图像',
  `register_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `register_ip` varchar(32) DEFAULT NULL COMMENT '注册ip地址',
  `login_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最近一次登录时间',
  `login_ip` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最近一次登录ip',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_users
-- ----------------------------
INSERT INTO `mall_users` VALUES ('4', null, null, 'oSmT20AJy516yMTHhzGnuu1yympI', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for mall_wallet
-- ----------------------------
DROP TABLE IF EXISTS `mall_wallet`;
CREATE TABLE `mall_wallet` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `amount` double DEFAULT NULL COMMENT '金额',
  `score` double DEFAULT NULL COMMENT '积分',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `create_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of mall_wallet
-- ----------------------------
