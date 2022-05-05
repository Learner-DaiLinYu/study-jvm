package com.DLY.lambda;

public class test2 {
    private static void a(Meth m){
        m.b("holle");
    }

    public static void main(String[] args) {
        test2.a(System.out::println);
    }
}
interface Meth{
    void b(String s);
}
