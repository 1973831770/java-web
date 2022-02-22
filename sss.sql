SELECT * FROM stu,class WHERE stu.`cid`=class.`cid` AND `price`>=9999 AND `price`<=20000

#1、新建week1数据库(如果已经存在,则先删除,再创建) 
CREATE DATABASE week1;
USE week1;
#3、根据以上表结构通过sql语句建班级表
CREATE TABLE clazz(
cid INT(9) PRIMARY KEY AUTO_INCREMENT,
cname VARCHAR(20) NOT NULL);
#根据以上表结构通过sql语句建学生表
CREATE TABLE stu(
id INT(9),
sname VARCHAR(20) NOT NULL,
age INT(9) NOT NULL,
sex VARCHAR(10) NOT NULL,
skill_scores DOUBLE ,
theory _score DOUBLE,
cid INT(9));

#4、设置学生表中id编号字段为主键（3分）且自增
ALTER TABLE stu CHANGE id id INT(9) PRIMARY KEY AUTO_INCREMENT;
#5、修改学生表中cid字段为外键,关联班级表的主键
ALTER TABLE stu ADD FOREIGN KEY (cid) REFERENCES clazz(cid);
#6、修改学生表t_stu表名为t_student
ALTER TABLE stu RENAME t_student;
#7、使用sql语句给班级表的cname字段添加唯一性约束
ALTER TABLE clazz  CHANGE cname  cname VARCHAR(20) NOT NULL UNIQUE;
#8、通过sql语句向班级表插入3条数据,效果如下
INSERT clazz VALUES(0,'1901A'),(0,'1901B'),(0,'1901c');
#9、使用sql语句向学生中添加7条信息,效果如下
INSERT t_student VALUES(0,'张三',23,'男',45,99,1);
INSERT t_student VALUES(0,'李思思',33,'女',66,87,1);
INSERT t_student VALUES(0,'张大头',34,'男',78,66,2);
INSERT t_student VALUES(0,'李贝宁',54,'男',76,78,2);
INSERT t_student VALUES(0,'吴老大',56,'女',56,65,1);
INSERT t_student VALUES(0,'赵李',76,'男',88,48,1);
INSERT t_student VALUES(0,'文张',87,'女',45,90,3);
#10、查询所有的学生信息,要求能展示学生表中中所有字段和所属班级的名称,效果如下
select *from t_student,clazz  where t_student.cid=clazz.`cid`;
#11、查询大于33岁的学生的信息包含班级信息,效果如下
SELECT *FROM t_student,clazz  WHERE t_student.cid=clazz.`cid` and age>33;
#12、查询学生信息要求展示学生编号,姓名,年龄,总成绩, 效果如下
select id ,sname ,age,sex,skill_scores+theory _score score from t_student,clazz where t_student.cid=clazz.`cid`
#13、查询每个班级的学生数量, 效果如下
select cname ,count(cname) FROM t_student,clazz  WHERE t_student.cid=clazz.`cid` group by cname
#13、查询姓张的学生信息, 效果如下
SELECT * FROM t_student,clazz  WHERE t_student.cid=clazz.`cid` and sname like '%张%'
#14、查询每个班级的学生的技能和理论平均成绩, 效果如下
select cname '班级' ,avg (skill_scores) '技能平均成绩',avg (theory _score) '理论平均成绩' from  t_student,clazz where t_student.cid=clazz.`cid` group by cname
#15、年龄大于75以上的学生,理论和技能成绩加5分
update t_student set  skill_scores=skill_scores+5,theory _score=theory _score+5 where age>75 