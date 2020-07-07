create database school_database;
 
use school_database;
 
drop table if exists teachers;
create table teachers (
   id int NOT NULL AUTO_INCREMENT,
   status_ varchar(50),
   name_ varchar(50),
   age int,
   sex CHARACTER,
   primary key (id));
 
insert into teachers values (1001, 'Teacher', 'Dusan', 42, 'M');
 
select * from teachers;

drop table if exists students;
create table students (
   id int NOT NULL AUTO_INCREMENT,
   status_ varchar(50) not null,
   name_ varchar(50),
   age int,
   sex CHARACTER,
   primary key (id));
 
insert into students values (1001, 'Student', 'Jakub', 18, 'M');
 
select * from students;