package servlet;

import bean.Blogger;
import bean.Plan;
import dao.PlanDaoLmp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindByid", value = "/FindByid")
public class FindByid extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //调用查询id和回显方法
        String id = request.getParameter("id");

        PlanDaoLmp dao = new PlanDaoLmp();

        Plan list = dao.findByid(new Integer(id));
        List<Blogger> arr = dao.findAllBlo();

        //存值
        request.setAttribute("l",list);
        request.setAttribute("arr",arr);
        //转发
        request.getRequestDispatcher("update.jsp").forward(request,response);


    }
}