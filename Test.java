package com.be.test;

import com.be.bean.Admin;
import com.be.dao.AdminDaoImpl;

public class Test {

    public static void main(String[] args) {


        AdminDaoImpl ad = new AdminDaoImpl();
        Admin admin = new Admin(0, "admin", "admin");
        Admin login = ad.login(admin);
        System.out.println(login);
    }
}
