#建立数据库
CREATE DATABASE admin;
USE admin;
#（1）通过sql语句建表,表名为t_soft ( 5分 )
#（2）通过sql语句建表,字段和类型如上所示 ( 5分 )
CREATE TABLE t_soft(
id INT AUTO_INCREMENT COMMENT'员工id',
tname VARCHAR(100) COMMENT'员工姓名' NOT NULL,
sex VARCHAR(4) COMMENT'性别' NOT NULL,
card_no VARCHAR(20) COMMENT'身份证号' NOT NULL,
hir_date DATE COMMENT'入职日期' NOT NULL,
sal DOUBLE COMMENT'底薪' NOT NULL,
dept_name VARCHAR(255) COMMENT'岗位名称' NOT NULL,
content VARCHAR(500) COMMENT'备注',
#（3）通过sql语句建表,设置id为主键且自增 ( 5分 )
PRIMARY KEY(id));

#（4）设置员工姓名字段唯一约束( 5分 )
ALTER TABLE t_soft CHANGE tname `admin`tname VARCHAR(100) UNIQUE;

#（5）修改底薪字段数据类型为decimal(16,2)( 5分 )
ALTER TABLE t_soft CHANGE sal sal DECIMAL(16,2);

#（6）通过sql语句修改sex的字段名为gender( 5分 )
ALTER TABLE t_soft CHANGE sex gender VARCHAR(4);

#（7）通过sql语句,删除备注字段 ( 5分 )
ALTER TABLE t_soft DROP content;

#（8）表中插入5条不重复的数据( 5分 )
INSERT t_soft VALUES(0,'张三1','男','123456789','2022-1-1','4500','技术员');
INSERT t_soft VALUES(0,'张三2','男','123456789','2022-1-2','4500','会计员');
INSERT t_soft VALUES(0,'张三3','男','123456789','2022-1-3','4500','技术员');
INSERT t_soft VALUES(0,'张三4','女','123456789','2022-1-4','48800','质检员');
INSERT t_soft VALUES(0,'张三5','女','123456789','2022-1-5','10000','技术员');

#（9）把所有女性的底薪增加5000( 5分 )
UPDATE t_soft SET sal=sal+5000 WHERE gender='女';

#（10）展示所有员工信息,并按照底薪倒叙排序,字段名称以中文形式显示( 5分 )
SELECT id 员工id ,tname 员工姓名, gender 性别,card_no 身份证号, hir_date 入职日期, sal 底薪, dept_name 岗位名称 FROM t_soft ORDER BY  sal DESC;

#（11）展示男性与女性的平均薪资( 5分 )
SELECT  gender 性别 ,AVG(sal) 平均薪资 FROM t_soft GROUP BY gender ;

#（12）展示今年入职员工中,底薪最高的员工薪资( 5分 )
SELECT*FROM t_soft WHERE sal=(SELECT MAX(sal) FROM t_soft WHERE hir_date LIKE '2022%');

#（13）查询员工表，实现分页查询。从第2条记录开始查询，查询3条记录，并显示员工信息（5分）
SELECT *FROM t_soft LIMIT 1,3;

#（14）查询所有员工的平均底薪( 5分 )
SELECT AVG(sal) 平均底薪 FROM t_soft ;

#（15）查询每个岗位的平均薪资( 5分 )
SELECT dept_name 岗位名称, AVG(sal) 平均底薪 FROM t_soft GROUP BY dept_name;

#（16）查询姓名中包含”乐”的男性员工的信息(没有对应数据要先插入测试数据)( 5分 )
INSERT t_soft VALUES(0,'张乐','女','123456789','2022-1-5','4900','技术员');
SELECT *FROM  t_soft  WHERE tname LIKE  '%乐%';

#（17）查询姓名中最后一个字是”闯”的学生信息( 5分 )
SELECT *FROM  t_soft  WHERE tname LIKE  '%闯';

#（18）删除底薪低于5000的员工( 5分 )
DELETE FROM t_soft WHERE sal<5000;

#（19）查询各个岗位中底薪高于10000的人数,展示岗位名称和人数( 5分 )
SELECT  dept_name 岗位名称,COUNT(*) 人数  FROM  t_soft WHERE sal>10000 GROUP BY dept_name ;


#（20）删除员工表中所有数据,并且删除后的id自增序列从1开始( 5分 )
TRUNCATE t_soft;





