package edu.uestc.service;

public class SgtPeppers implements CompactDisc{

    Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("我是SgtPeppers");
        System.out.println("我的age："+age);
    }
}
