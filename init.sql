CREATE TABLE `test` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(32) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_auth_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `parent_id` int(10) NOT NULL DEFAULT '0' COMMENT '父菜单 0:一级菜单',
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '菜单类型 1-菜单 2-功能',
  `sys_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '系统类型 0:在线选课',
  `icon_class` varchar(200) NOT NULL DEFAULT '' COMMENT 'icon',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '功能名称',
  `menu_url` varchar(200) NOT NULL DEFAULT '' COMMENT '功能点url',
  `power_ids` varchar(100) NOT NULL DEFAULT '' COMMENT 'menu_url对应的power_ids数据',
  `params_in` varchar(500) NOT NULL DEFAULT '' COMMENT '功能点入参',
  `description` varchar(100) NOT NULL DEFAULT '' COMMENT '功能点描述',
  `creator` varchar(20) NOT NULL DEFAULT '' COMMENT '添加人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '有效性 0:有效，1:无效',
  PRIMARY KEY (`id`),
  KEY `idx_parent_id` (`parent_id`),
  KEY `idx_menu_url` (`menu_url`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='菜单表';