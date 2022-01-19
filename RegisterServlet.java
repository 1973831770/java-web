package com.servlet;

import bean.Teachaer;
import dao.TeacherDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String teachaerName = req.getParameter("teachaerName");
        String teachaerPwd = req.getParameter("teachaerPwd");
        Teachaer tea = new Teachaer(0, teachaerName, teachaerPwd);

        TeacherDaoImpl tt = new TeacherDaoImpl();
        int i = tt.addtea(tea);
        if(i>0){
            req.setAttribute("tt",tt);
            req.getRequestDispatcher("regSuccess.jsp").forward(req,resp);
        }


    }
}