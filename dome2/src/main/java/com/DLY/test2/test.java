package com.DLY.test2;

import java.util.ArrayList;

public class test {
    private static final Object[] a={};
    private static final Object[] b={};
    private static final String c="";
    private static final String d="";

    public static void main(String[] args) {
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println();
//        Integer a1=129;
//        Integer a2=129;
//        System.out.println(a1==a2);
        ArrayList<Object> objects = new ArrayList<>(0);
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        objects.add(5);
    }
}
