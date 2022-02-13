package com.bw.servlet;

import com.bw.bean.News;
import com.bw.dao.NewsDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateNews", value = "/UpdateNews")
public class UpdateNews extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //1.接受请求参数
        String newsId = request.getParameter("newsId");
        String newsTitle = request.getParameter("newsTitle");
        String newsAuthor = request.getParameter("newsAuthor");
        News news = new News(new Integer(newsId), newsTitle, newsAuthor);
       //2.调用jdbc
        NewsDaoImp dao = new NewsDaoImp();
        int i = dao.updateNews(news);
        //3.存值

        //4.重新查询数据转发到FindAll
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}