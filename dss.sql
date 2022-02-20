CREATE  DATABASE kao17;
USE kao17;
CREATE TABLE t_blogger(
bid INT  PRIMARY KEY AUTO_INCREMENT,
bname VARCHAR(50));

CREATE TABLE t_plan(
id INT  PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(8),
content VARCHAR(255),
start_time DATETIME,
`status` INT,
bid INT ,
FOREIGN KEY (bid) REFERENCES t_blogger(bid) );


DELETE FROM t_plan WHERE id=?

SELECT *FROM t_blogger;

SELECT *FROM t_plan WHERE id=?

UPDATE t_plan SET `name`='过年' ,content='吃饺子',start_time='2022-02-08',`status`='0',bid='1' WHERE id=6

SELECT *FROM t_plan,t_blogger WHERE t_plan.`bid`=t_blogger.bid AND `name` LIKE '%好%'

SELECT *FROM t_plan,t_blogger WHERE t_plan.`bid`=t_blogger.bid AND `status`=?

制作炫酷报告 制作炫酷报告，4步带你快速学习
好好学习 学习很快乐
潜力无限  潜力无极限
考试一百分 今天直播考试一百分
我入职国企 月入十万不是梦

INSERT t_plan VALUES(0,?,?,?,?,?)

INSERT t_plan VALUES(0,'制作炫酷报告','制作炫酷报告，4步带你快速学习','2022-02-02',0,1);
INSERT t_plan VALUES(0,'好好学习','学习很快乐','2022-02-02',0,1);
INSERT t_plan VALUES(0,'潜力无限','潜力无极限','2022-02-02',1,2);
INSERT t_plan VALUES(0,'考试一百分','今天直播考试一百分','2022-02-02',1,3);
INSERT t_plan VALUES(0,'我入职国企','月入十万不是梦','2022-02-02',1,3);


