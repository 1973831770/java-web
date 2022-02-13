package com.bw.servlet;

import com.bw.bean.News;
import com.bw.dao.NewsDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindById", value = "/FindById")
public class FindById extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //1.接受请求参数
        String newsId = request.getParameter("newsId");

        //2.调用jdbc
        NewsDaoImp dao = new NewsDaoImp();
        News news = dao.findById(new Integer(newsId));
        //3.存值
        request.setAttribute("n",news);
        //4.转发
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }
}