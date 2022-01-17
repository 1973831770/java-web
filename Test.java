package test;

import bean.Admin;
import dao.AdminManager;

import java.util.List;

public class Test {

    public static void main(String[] args) {


        AdminManager ad = new AdminManager();
        Admin admin = new Admin(0, "admin", "admin");
        Admin show = ad.show(admin);
        if(show!=null){
            System.out.println("登录成功");
        }

        Admin admin1 = new Admin(0,"zhangsan","1234");
        int i = ad.findall(admin1);
        if(i>0){
            System.out.println("注册成功");
        }

        List<Admin> finaall = ad.finaall();
        for (Admin admin2 : finaall) {
            System.out.println(admin2);
        }
        Admin aa = new Admin(5, "张飒", "145");
        ad.update(aa);




    }
}
