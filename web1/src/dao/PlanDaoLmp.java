package dao;

import bean.Blogger;
import bean.Plan;
import util.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlanDaoLmp implements  PlanDao{

    @Override
    public List<Plan> findAll() {

        ArrayList<Plan> arr = new ArrayList<>();
        String sql=" SELECT *FROM t_plan,t_blogger WHERE t_plan.`bid`=t_blogger.bid;";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

                arr.add(new Plan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(8)));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arr;
    }

    @Override
    public List<Plan> findAllTj(String name, String status) {
        ArrayList<Plan> arr = new ArrayList<>();

        String sql=" SELECT *FROM t_plan,t_blogger WHERE t_plan.`bid`=t_blogger.bid";

        if(name!=""){
            sql= sql+ " AND `name` LIKE '%"+name+"%'";
        }
        if(status!=""){
            sql= sql+ " AND `status`=?";
        }

        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            if(status!=""){
                ps.setString(1,status);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

                arr.add(new Plan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(8)));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arr;
    }

    @Override
    public List<Blogger> findAllBlo() {

        ArrayList<Blogger> arr = new ArrayList<>();
        String sql="SELECT *FROM t_blogger";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

                Blogger blogger = new Blogger(rs.getInt(1),
                        rs.getString(2));

                arr.add(blogger);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arr;
    }

    @Override
    public int insert(Plan plan) {

        String sql="INSERT t_plan VALUES(0,?,?,?,?,?)";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,plan.getName());
            ps.setString(2,plan.getContent());
            ps.setString(3,plan.getStart_time());
            ps.setInt(4,plan.getStatus());
            ps.setInt(5,plan.getBid());
            return ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

    @Override
    public Plan findByid(int id) {

        String sql="SELECT *FROM t_plan WHERE id=?";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){

             return    new Plan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        "");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public int update(Plan plan) {

        String sql=" UPDATE t_plan SET `name`=?,content=?,start_time=?,`status`=?,bid=? WHERE id=?";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,plan.getName());
            ps.setString(2,plan.getContent());
            ps.setString(3,plan.getStart_time());
            ps.setInt(4,plan.getStatus());
            ps.setInt(5,plan.getBid());
            ps.setInt(6,plan.getId());
            return ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

    @Override
    public int deleter(int id) {

        String sql="DELETE FROM t_plan WHERE id=?";
        Connection con = BaseDao.getcon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

}
