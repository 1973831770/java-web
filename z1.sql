
CREATE  DATABASE teachaers;
USE  teachaers;
CREATE TABLE teacher(
id INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
tname VARCHAR(40) NOT NULL COMMENT'名称' ,
tpassword VARCHAR(40) NOT NULL COMMENT'密码');


SELECT *FROM teacher WHERE tname=? AND tpassword=?;

INSERT teacher  VALUES(0,?,?);