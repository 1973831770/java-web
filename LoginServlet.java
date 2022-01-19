package Servlet;

import com.be.bean.Admin;
import com.be.dao.AdminDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String adminName = req.getParameter("adminName");
        String adminPwd = req.getParameter("adminPwd");

        Admin a = new Admin(0, adminName, adminPwd);

        AdminDaoImpl admin = new AdminDaoImpl();
        Admin ad = admin.login(a);

        if(ad!=null){
            req.setAttribute("admin",admin);
            req.getRequestDispatcher("welcome.jsp").forward(req,resp);
        }else {
            req.setAttribute("c","用户名或密码错误");
            req.getRequestDispatcher("fail.jsp").forward(req,resp);

        }

    }
}