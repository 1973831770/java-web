package servlet;

import bean.Plan;
import dao.PlanDaoLmp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Insert", value = "/Insert")
public class Insert extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        String content = request.getParameter("content");
        String start_time = request.getParameter("start_time");
        String status = request.getParameter("status");
        String bid = request.getParameter("bid");

        //<%--    ④把直播间名称,直播内容,开播时间添加到数据库中（3分)--%>
        Plan plan = new Plan(0,name,content,start_time,new Integer(status),new Integer(bid),"");

        PlanDaoLmp dao = new PlanDaoLmp();

        dao.insert(plan);

        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}