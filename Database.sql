create database if not exists  library;
use library;

create table if not exists admindata(
id int(5) not null primary key auto_increment,
name varchar(20) not null,
phonenumber varchar(15),
state varchar(10) default 'normal',
address varchar(50),
password varchar(18) not null
)charset utf8 engine myisam;
alter table admindata auto_increment=90001;

create table if not exists userdata(
id int(5) not null primary key auto_increment,
name varchar(20) not null,
phonenumber varchar(15),
state varchar(10) default 'normal',
address varchar(50),
password varchar(18) not null
)charset utf8 engine myisam;
alter table userdata auto_increment=10001;

create table if not exists bookdata(
id int(5) not null primary key auto_increment,
title varchar(30) not null,
author varchar(30) not null,
type varchar(50) not null,
publishing_house varchar(50) not null,
publicationdate varchar(15),
book_borrowing_state varchar(20) default 'Not lent',
borrower_id int(5),
BorrowDate date
)charset utf8 engine myisam;
alter table bookdata auto_increment=50001;

create table if not exists bookreport(
BookID int(5),
BookName varchar(30),
UserAction varchar(15),
UserID int(5),
ActionTime timestamp #primary key
)charset utf8 engine myisam;

create table if not exists userreport(
userID int(5),
UserName varchar(20),
UserAction varchar(15),
ActionTime timestamp #primary key
)charset utf8 engine myisam;

insert into userdata(name,password,phonenumber,address) values 
('user','niit1234','15234526352','Renmin Road 58th');
insert into admindata(name,password,phonenumber,address) values 
('root','niit1234','13732134321','hbrd');
insert into bookdata(title,author,publishing_house,book_borrowing_state,borrower_id,type)
 values ('Brief History of Time','Stephen Hawking','OnePublishingHouse',
 'lent','10001','Science and Technology');