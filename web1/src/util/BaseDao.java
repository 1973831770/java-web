package util;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {


    //(6)编写数据库连接工具类,
    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //编写获得Connection和关闭资源的方法（3分）
    public static Connection  getcon(){

        try {
            return DriverManager.getConnection("jdbc:mysql:///kao17","root","root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return  null;
    }

    //关闭资源方法
    public static void Close(AutoCloseable...args){
        if(args!=null){
            for (AutoCloseable arg : args) {
                if(arg!=null){

                    try {
                        arg.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
