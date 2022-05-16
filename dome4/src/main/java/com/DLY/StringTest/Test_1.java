package com.DLY.StringTest;

public class Test_1 {
    public static void main(String[] args) {
        String s=new String("1"); // 执行完了 注意此时常量池中有1 s并不是指向常量池的1
        String ss=s.intern(); //由于常量池中的"1"已经  存在返回的是常量池中的地址
        String s2="1";  //由于常量池中的"1"已经  存在返回的是常量池中的地址
        System.out.println(s==s2);  //false
        System.out.println(s==ss);  //false
        System.out.println(ss==s2);  //true
        String s3=new String("1")+new String("2");  //这里常量池中有1和2 但是没有12
        s3.intern(); //由于常量池中没有12所以调用该方法会在字符串常量池中添加12常量池指向堆中的12
        String s4="12";
        System.out.println(s3==s4);  //true
    }
}
