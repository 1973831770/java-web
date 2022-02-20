package dao;

import bean.Blogger;
import bean.Plan;

import java.util.List;

public interface PlanDao {


    //(7)正确定义和使用Dao层接口（2分）
    public List<Plan> findAll();


    public List<Plan> findAllTj(String name, String status );


    public List<Blogger> findAllBlo();

    public int insert(Plan plan);

    public  Plan  findByid(int id);

    public int update(Plan plan);

    public int deleter(int id);





}
