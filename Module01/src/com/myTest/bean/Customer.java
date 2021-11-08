package com.myTest.bean;

/**
 * @author Autumn
 * @date 2021/11/6 - 20:21
 */
public class Customer extends Person{
    private String name;
    private int age;
    private String gender;

    public Customer() {
    }

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("客戶吃飯");
    }
}
