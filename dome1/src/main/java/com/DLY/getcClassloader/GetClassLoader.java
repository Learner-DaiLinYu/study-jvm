package com.DLY.getcClassloader;

import java.sql.DriverManager;

public class GetClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.
        ClassLoader classLoader1 = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader1); //null
        //2.
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);
        //3.
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //4.
    }
}
