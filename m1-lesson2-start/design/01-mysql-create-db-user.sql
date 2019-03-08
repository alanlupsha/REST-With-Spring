create user 'restuser'@'localhost' identified by 'restmy5ql';

create database restwithspring;

grant all privileges on  restwithspring.* to 'restuser'@'localhost';
