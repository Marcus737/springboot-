create database mbdb;

create table mbdb.user
(
    id int auto_increment
        primary key,
    username varchar(1000) null
);

INSERT INTO mbdb.user (id, username) VALUES (1, 'zhangsan');
INSERT INTO mbdb.user (id, username) VALUES (2, 'lisi');
INSERT INTO mbdb.user (id, username) VALUES (3, 'wangwu');