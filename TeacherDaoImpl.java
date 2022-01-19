package dao;

import bean.Teachaer;
import util.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherDaoImpl implements ITeacherDao{
    @Override
    public int addtea(Teachaer tea) {

        String sql="INSERT teacher  VALUES(0,?,?);";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,tea.getName());
            ps.setString(2,tea.getPwd());
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

    @Override
    public  Teachaer login(Teachaer tea) {

        String sql="SELECT *FROM teacher WHERE tname=? AND tpassword=?;";

        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,tea.getName());
            ps.setString(2,tea.getPwd());
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                return  new Teachaer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
