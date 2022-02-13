package com.bw.servlet;

import com.bw.bean.News;
import com.bw.dao.NewsDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAll", value = "/FindAll")
public class FindAll extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //1.接受请求参数


          //2.调用jdbc
        NewsDaoImp dao = new NewsDaoImp();
        List<News> list = dao.findAll();

          //3.存值
        request.setAttribute("list",list);
          //4.转发
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}