-- we don't know how to generate schema dm (class Schema) :(
create table depart_info
(
	id varchar(32) not null
		primary key,
	depart_name varchar(32) null,
	depart_code varchar(32) null,
	del_flag char default '0' null
)
;

create table drug_info
(
	id varchar(32) not null
		primary key,
	drug_code varchar(32) null,
	drug_name varchar(64) null,
	unit varchar(10) null,
	price double null,
	del_flag char default '0' null
)
;

/*create table drug_list
(
	id varchar(32) not null
		primary key,
	mr_id varchar(32) null,
	status char null,
	update_time datetime null,
	operator_id varchar(32) null,
	amount double null,
	self_paying double null,
	del_flag char default '0' null
)
;*/

create table mr_drug
(
	drug_info_id varchar(32) default '' not null,
	mr_id varchar(32) default '' not null,
	drug_count int null,
	primary key (drug_info_id, mr_id)
)
;

create table employee_info
(
	id varchar(32) not null
		primary key,
	username varchar(32) null,
	password varchar(32) null,
	name varchar(32) null,
	depart_id varchar(32) null,
	del_flag char default '0' null,
	phone varchar(20) null
)
;

create table medical_record
(
	id varchar(32) not null
		primary key,
	name varchar(32) null,
	gender char null,
	doctor_id varchar(32) null,
	age int null,
	depart_id varchar(32) null,
	contract varchar(10) null,
	pay_status char null comment '0：未付款，1：暂存 2：付款',
	pay_time datetime null,
	operator_id varchar(32) null,
	amount double null,
	self_paying double null,
	update_time datetime null,
	del_flag char default '0' null
)
;

