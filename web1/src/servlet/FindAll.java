package servlet;

import bean.Plan;
import dao.PlanDaoLmp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAll", value = "/FindAll")
public class FindAll extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PlanDaoLmp dao = new PlanDaoLmp();

        List<Plan> list = dao.findAll();

        request.setAttribute("list",list);

        request.getRequestDispatcher("show.jsp").forward(request,response);


    }
}