-- 用户表--
create table `t_user`(
	`id` int not null auto_increment,
	`name` varchar(32) comment "用户名",
	`mobile` varchar(16) not null comment "手机号",
	`openid` varchar(64) not null comment "微信openid",
	`create_time` timestamp not null default current_timestamp comment "创建时间",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "修改时间",
	primary key(`id`)
)

-- 会议室表--

create table `t_meet`(
	`id` int not null auto_increment,
	`name` varchar(32) not null comment "会议室名",
	`address` varchar(64) comment "会议室地址",
	`create_time` timestamp not null default current_timestamp comment "创建时间",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "修改时间",
	primary key(`id`)
)

-- 会议室预约表--

create table `t_reserve_meet`(
	`id` int not null auto_increment,
	`openid` varchar(64) not null comment "预约人openid",
	`meet_id` int not null comment "会议室id",
	`begin_time` timestamp null default null comment "会议开始时间",
	`end_time` timestamp null default null comment "会议结束时间",
	`status` char(2) comment "会议状态 正常 取消",
	`create_time` timestamp not null default current_timestamp comment "创建时间",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "修改时间",
	primary key(`id`)
)