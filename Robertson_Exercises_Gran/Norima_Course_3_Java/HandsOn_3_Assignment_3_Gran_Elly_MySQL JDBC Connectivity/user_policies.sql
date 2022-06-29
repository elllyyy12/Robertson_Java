create database User_Policies;
use User_Policies;

create table user_policies 
(
	policy_no varchar(20) primary key,
	user_id int,
	date_registered date,
	policy_type_id varchar(10)
);

insert into user_policies values('689314',1111,'1994-4-18','6896');
insert into user_policies values('689316',1111,'2012-5-18','6895');
insert into user_policies values('689317',1111,'2012-6-20','6894');
insert into user_policies values('689318',2222,'2012-6-21','6894');
insert into user_policies values('689320',3333,'2012-6-18','6894');
insert into user_policies values('689420',4444,'2012-4-09','6896');

select * from user_policies;