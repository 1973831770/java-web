package com.test;

import com.bean.Admin;
import com.dao.AdminManager;

import java.util.List;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {


        AdminManager m = new AdminManager();




        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("根据编号查询：1 插入 2查询 3更改 4删除");
            int num = sc.nextInt();

            switch (num){


                case 1:{

                    m.insert();
                    break;
                }
                case 2:{

                    List<Admin> findall = m.findall();
                    for (Admin admin : findall) {
                        System.out.println(admin);
                    }
                    break;
                }
                case 3:{
                    m.update();
                    break;
                }
                case 4:{
                    m.delete();
                    break;
                }
            }
        }


    }
}
