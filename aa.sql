DELIMITER $$

CREATE
   
    TRIGGER aa AFTER DELETE
    ON admin
    FOR EACH ROW BEGIN
    INSERT `log` VALUES(0,CONCAT('你做了删除编号',old.adminId),NOW());

    END$$

DELIMITER ;