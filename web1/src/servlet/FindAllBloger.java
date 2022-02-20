package servlet;

import bean.Blogger;
import dao.PlanDaoLmp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAllBloger", value = "/FindAllBloger")
public class FindAllBloger extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //调用回显方法
        PlanDaoLmp dao = new PlanDaoLmp();

        List<Blogger> arr = dao.findAllBlo();

        request.setAttribute("arr",arr);

        request.getRequestDispatcher("insert.jsp").forward(request,response);

    }
}