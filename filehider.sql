CREATE DATABASE FILEHIDER;
USE FILEHIDER;
create table users(id int primary key auto_increment, name varchar(100), email varchar(100) unique);

DESC USERS;

create table data(id int primary key auto_increment, name varchar(100), path varchar(255), email varchar(100), bin_data blob);

DESC DATA;

SHOW DATABASES;
use filehider;
show tables;
desc users;
select * from data;