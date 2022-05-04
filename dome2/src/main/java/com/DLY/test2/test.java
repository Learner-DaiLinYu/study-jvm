package com.DLY.test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        List<String> a=new LinkedList<>();
        a.add("1");
        new LinkedList<Object>(){{add(1);add(2);}};
    }
}
