package com.DLY.Test;

public class test2 {
    static class Father{
        public static int A=1;
        static{
            A=2;
        }
    }
    static class Son extends Father{
        public static int B=A;   //2
    }

    public static void main(String[] args) {
        //需要加载Son看见他有父类，就去先加载他的父类，然后在加载子类
        System.out.println(Son.B);
    }
}
