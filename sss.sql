CREATE DATABASE newdb_12;
USE newdb_12;
CREATE  TABLE  admin(
adminId INT PRIMARY KEY AUTO_INCREMENT,
adminName VARCHAR(25) NOT NULL ,
adminPwd VARCHAR(25));


SELECT *FROM admin  WHERE adminName=? AND  adminPwd=?;