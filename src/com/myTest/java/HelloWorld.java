package com.myTest.java;

import com.myTest.bean.Customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Autumn
 * @date 2021/11/6 - 16:09
 */
public class HelloWorld {
    private static final Customer CUST = new Customer();
    public static final int NUM = 1;
    private int id = 1;


    public static void main(String[] args) {
        testUpdate();
        CUST.setAge(22);
        CUST.setGender("Female");
        CUST.setName("Nacy");
        System.out.println(CUST.toString());
    }
    //这是程序入口

    public static void testUpdate() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("哈哈，出錯啦.....");
            e.printStackTrace();
        }
    }

    public void testRemove() {
        System.out.println("测试删除方法");
    }
}
