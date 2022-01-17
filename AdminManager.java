package dao;

import bean.Admin;
import util.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminManager implements IAdminDao{


    @Override
    public Admin show(Admin admin) {

        String sql="SELECT *FROM admin WHERE adminName=? AND adminPwd=?;";

        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

                return  new Admin(rs.getInt(1),rs.getString(2),
                        rs.getString(3));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public int findall(Admin admin) {

        String sql="INSERT admin VALUES(0,?,?);";

        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminPwd());
            ps.setString(2,admin.getAdminPwd());
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public List<Admin> finaall(){

        ArrayList<Admin> arr = new ArrayList<>();
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT *from admin;");
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
        return  arr;
    }

    public  int update(Admin admin){

        String sql=" UPDATE admin SET adminName=? , adminPwd=? WHERE adminId=?;";

        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());
            ps.setInt(3,admin.getAdminId());
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

}
