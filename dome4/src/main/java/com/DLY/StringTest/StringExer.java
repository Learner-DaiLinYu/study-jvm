package com.DLY.StringTest;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExer {
    public static void main(String[] args) {
        System.out.println();  //空格也存放到string常量词内
        String abc = String.valueOf("abc");
        String s1="abc"; //字面量定义的方式，"abc"存储在字符串常量池里面
        System.out.println(abc==s1);

//        Student student = new Student();
//        student.setName("代理");
//        System.out.println(student);
//        setName(student);
//        Student a=student;
//        a.setName("aaa");
//        System.out.println(student);
//        System.out.println(a);


        ArrayList<String> strings = new ArrayList<>();
        addString(strings);
        strings.forEach(System.out::println);

        int[] a={1,2,3,4};
        Arrays.stream(a).forEach(System.out::println);
        ChangA(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void ChangA(int[] b){
        int[] c={4,5,6,7};
        b=c;
    }

    public static void addString(ArrayList<String> strings){
        strings.add("bubu");
        strings=new ArrayList<String>(){{
           add("123");
           add("456");
        }};
    }

    public static void setName(Student stu){
        stu.setName("aaaa");
    }
}
class Student{
    private String name;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

}
