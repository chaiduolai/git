package com.itheima.exam;

public class Test {
    public static void main(String[] args) {
        Teacher a=new Teacher();
       a.setAge(30);
       a.setContent("java");
       a.setName("周老师");
        a.showContent();
        a.showEat();

        Student b=new Student();
        b.setContent("java");
        b.setName("韩同学");
        b.setAge(18);
        b.showEat();
        b.showStudent();
    }
}