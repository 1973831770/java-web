package com.be.dao;

import com.be.bean.Admin;
import com.be.util.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDaoImpl implements  IAdminDao{

    @Override
    public Admin login(Admin admin) {

        String sql="SELECT *FROM admin  WHERE adminName=? AND  adminPwd=?;";

        Connection con = BaseDao.getcon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getName());
            ps.setString(2,admin.getName());

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                return  new Admin(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
