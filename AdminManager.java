package com.dao;

import com.bean.Admin;
import com.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminManager implements  Adminint{


    //向表admin里成功添加3条记录，Eclipse控制台打印输出：
    @Override
    public void insert() {

        String sql ="INSERT admin  VALUES(0,'admin_1','123456'),(0,'admin_2','6543216'),(0,'admin_3','abcdefg');";
        Connection con = JDBCUtil.getcon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            int i = ps.executeUpdate();
            System.out.println("插入"+i+"条记录");
            System.out.println("数据添加成功");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    //查询表admin里的全部记录，Eclipse控制台打印输出：（5分）
    @Override
    public List<Admin> findall() {

        ArrayList<Admin> arr = new ArrayList<>();

        String sql="SELECT *FROM admin ;";

        Connection con = JDBCUtil.getcon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                Admin admin = new Admin(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                        arr.add(admin);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arr;
    }

    //修改表admin里用户名admin_3的密码为666999，然后查询，并在Eclipse控制台分别打印输出：（10分)
    @Override
    public void update() {

        String sql="UPDATE admin SET adminPwd='666999' WHERE adminName='admin_3';";

        Connection con = JDBCUtil.getcon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            int i = ps.executeUpdate();
            System.out.println("更新"+i+"条记录");
            System.out.println("数据更新成功！");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void delete() {

        String sql="DELETE FROM admin WHERE adminName='admin_2';";

        Connection con = JDBCUtil.getcon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            int i = ps.executeUpdate();
            System.out.println("删除"+i+"条记录");
            System.out.println("数据删除成功！");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
