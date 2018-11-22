package com.itheima.exam;

public class Student {
    private String name;
    private int age;
    private String content;

    public Student() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void showEat() {
        System.out.println("年龄为" + age + "的" + name + "正在吃饭");
    }
    public void showStudent(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"面向对象的知识");
    }
}
