package com.DLY.enumTest;

public class test {
    public static void main(String[] args) {
        String one1 = Text.ONE.getStr();
        String one2 = Text.ONE.getStr();
        String str = Text.TOW.getStr();


        //虽然调用了两次无参构造 但是还是同一个对象
        System.out.println(one1==one2);  //true
        System.out.println(one1==str);  //true
    }
}
