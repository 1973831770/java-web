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

@WebServlet(name = "Tj", value = "/Tj")
public class Tj extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        String status = request.getParameter("status");

        PlanDaoLmp dao = new PlanDaoLmp();

        List<Plan> list = dao.findAllTj(name, status);

        request.setAttribute("list",list);

        request.setAttribute("name",name);
        request.setAttribute("status",status);

        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}