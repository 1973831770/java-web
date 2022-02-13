package com.bw.dao;

import com.bw.bean.News;
import com.bw.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImp implements  NewsDao {
    @Override
    public List<News> findAll() {
        ArrayList<News> list = new ArrayList<News>();
        String  sql="SELECT  *  FROM  news";
        Connection con = JDBCUtils.getCon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            //预编译 专门处理?
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new News(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public News findById(int newsId) {
        String  sql="SELECT  *  FROM  news  WHERE   newsId=?";
        Connection con = JDBCUtils.getCon();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            //预编译 专门处理?
            ps.setInt(1,newsId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new News(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public int updateNews(News news) {
        String sql="UPDATE   news  SET   newsTitle=?,newsAuthor=?   WHERE  newsId=?";


        Connection con = JDBCUtils.getCon();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,news.getNewsTitle());
            ps.setString(2,news.getNewsAuthor());
            ps.setInt(3,news.getNewsId());

            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
