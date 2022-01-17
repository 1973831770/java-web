package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {


    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public  static Connection  getcon(){

        try {
            return  DriverManager.getConnection("jdbc:mysql:///day17", "root", "root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }




}
