package com.servlet;

import bean.Teachaer;
import dao.TeacherDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginservlet", value = "/loginservlet")
public class loginservlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String adminName = req.getParameter("adminName");
        String adminPwd = req.getParameter("adminPwd");
        Teachaer teachaer = new Teachaer(0,adminName,adminPwd);

        TeacherDaoImpl tea = new TeacherDaoImpl();
        Teachaer t = tea.login(teachaer);

        if(t!=null){
            req.setAttribute("t",t);
            req.getRequestDispatcher("welcome.jsp").forward(req,resp);

        }else {
            req.setAttribute("c","用户名或密码错误");
            req.getRequestDispatcher("fail.jsp").forward(req,resp);

        }




    }
}