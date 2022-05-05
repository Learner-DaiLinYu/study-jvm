package com.DLY.lambda;

import java.util.ArrayList;
import java.util.function.Function;

public class test {

    public void b(int c,int b){
        System.out.println(c+b);
    }

    public static void main(String[] args) {
        //lambd语法
        MyInter myInter=test::b;
        myInter.a(new test(),1,4);
        //普通实现
        MyInter m=new MyInter() {
            @Override
            public void a(test t, int a, int b) {
                t.b(a,b);
            }
        };
        m.a(new test(),1,2);

        MyInter m2=(t,a,b)->t.b(a,b);
        m2.a(new test(),3,5);

        ArrayList<String> strings = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
        }};
        strings.forEach(System.out::println);
    }
}
interface MyInter{
    public void a(test t,int a,int b);
}

