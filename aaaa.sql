CREATE DATABASE day17;
USE  day17;
CREATE TABLE admin(
adminId INT PRIMARY KEY AUTO_INCREMENT,
adminName VARCHAR(25) NOT NULL,
adminPwd VARCHAR(25));


 INSERT admin VALUES(0,?,?);
 
 UPDATE admin SET adminName=? , adminPwd=? WHERE adminId=?;
 
 

