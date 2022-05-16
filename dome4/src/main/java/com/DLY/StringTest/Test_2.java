package com.DLY.StringTest;

public class Test_2 {
    public static void main(String[] args) {
        char[] str={'a','b','c'};
        String s = new String(str, 0, str.length);
        //通过char数组生产的string是不会放入常量池中的
//        s.intern();
        String s1="abc";
        System.out.println(s==s1);  //false
//        String.valueOf()
//        Object
    }
}
