
CREATE DATABASE  newsdb_7;

USE  newsdb_7;

CREATE  TABLE admin(
adminId INT PRIMARY KEY AUTO_INCREMENT,
adminName VARCHAR(25) NOT NULL,
adminPwd VARCHAR(25) NOT NULL);

INSERT admin  VALUES(0,'admin_1','123456'),(0,'admin_2','6543216'),(0,'admin_3','abcdefg');

SELECT *FROM admin ;

UPDATE admin SET adminPwd='666999' WHERE adminName='admin_3';

DELETE FROM admin WHERE adminName='admin_2';