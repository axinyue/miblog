
-- create database mi_blog charset utf8 collate utf8_general_ci;
use mydiary;
create table blog_user(
uid varchar(32) primary key not null comment "user uid key",
name varchar (60) not null comment "blog user name",
password varchar(60) not null comment "blog user password,md5(password+key)",
email varchar(50)  null comment "blog user email.forget password use this email find it",
isdel boolean default 0 comment "this user if isdel =1.he is not login blog"
);


