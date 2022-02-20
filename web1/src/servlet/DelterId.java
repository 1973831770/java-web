package servlet;

import dao.PlanDaoLmp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelterId", value = "/DelterId")
public class DelterId extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String id = request.getParameter("id");

        PlanDaoLmp dao = new PlanDaoLmp();
        int deleter = dao.deleter(new Integer(id));

        //②删除成功后跳转到列表页面(3分）
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}