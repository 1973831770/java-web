CREATE DATABASE week2;
USE week2;
CREATE TABLE dept(
deptId  INT PRIMARY KEY AUTO_INCREMENT,
dname VARCHAR(50) UNIQUE  );


INSERT dept VALUES(0,'销售部'),(0,'财务部'),(0,'技术部');


CREATE TABLE emp(
empId INT PRIMARY KEY AUTO_INCREMENT,
ename VARCHAR(50) NOT NULL,
eage INT(3)NOT NULL,
egendar CHAR(2),
deptId INT ,
CONSTRAINT wj1 FOREIGN KEY (deptId)  REFERENCES dept(deptId));

INSERT emp VALUES(0,'张三1',25,'男',1);
INSERT emp VALUES(0,'张三2',26,'男',2);
INSERT emp VALUES(0,'张三3',27,'男',1);
INSERT emp VALUES(0,'张三4',28,'男',2);
INSERT emp VALUES(0,'张三5',29,'女',1);
INSERT emp VALUES(0,'张三6',25,'男',3);

DELETE FROM emp WHERE dept;


TRUNCATE emp;

INSERT emp VALUES(0,'张三6',25,'男',3,);

SELECT *FROM emp;
SELECT *FROM  emp RIGHT JOIN dept ON emp.`deptId`=dept.deptId;

SELECT *FROM  emp RIGHT JOIN dept ON emp.`deptId`=dept.deptId WHERE dname=?;
