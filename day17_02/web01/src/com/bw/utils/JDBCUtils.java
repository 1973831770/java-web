package com.bw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

    //注册驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //建立连接
    public static Connection getCon() {
        try {
            return DriverManager.getConnection("jdbc:mysql:///newdb_17","root","root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //释放资源
    public static void close(AutoCloseable... agrs) throws Exception {
        for (AutoCloseable agr : agrs) {
            if (agr != null) {
                agr.close();
            }
        }
    }
}
