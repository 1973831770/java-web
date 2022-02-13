package com.bw.dao;

import com.bw.bean.News;

import java.util.List;

public interface NewsDao {

    public List<News>  findAll();

   //根据id查询个人信息
    public  News  findById(int  newsId);

    //修改：  1.根据id你需要修改的信息   2.然后在修改
    public  int   updateNews(News  news);
}
