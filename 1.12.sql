CREATE  DATABASE newsdb_6;
USE newsdb_6;
CREATE TABLE account(
id  INT  PRIMARY KEY AUTO_INCREMENT,
accouuntNo  VARCHAR(25) NOT NULL ,
balace DECIMAL(11,2));

BEGIN;

INSERT account VALUES(0,'张三','30000.99'),(0,'李四','29000.88'),(0,'王五','31000.89');

UPDATE  account SET balace=(balace-500) WHERE accouuntNo='李四' ;
UPDATE  account SET balace=(balace+500) WHERE accouuntNo='张三';

COMMIT;
