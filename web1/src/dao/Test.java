package dao;

import bean.Plan;

import java.util.List;

public class Test {

    public static void main(String[] args) {


        PlanDaoLmp dao = new PlanDaoLmp();

        Plan plan = new Plan(6, "今天年", "今天过年吃饺子", "2020-08-09", 0, 1, "");
        int update = dao.update(plan);
        System.out.println(update);


    }
}
