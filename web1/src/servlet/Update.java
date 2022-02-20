package servlet;

import bean.Plan;
import dao.PlanDaoLmp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Update", value = "/Update")
public class Update extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String content = request.getParameter("content");
        String start_time = request.getParameter("start_time");
        String status = request.getParameter("status");
        String bid = request.getParameter("bid");

        Plan plan = new Plan(new Integer(id), name, content, start_time,new Integer(status), new Integer(bid), "");

        PlanDaoLmp dao = new PlanDaoLmp();

        int update = dao.update(plan);


        request.getRequestDispatcher("FindAll").forward(request,response);


    }
}