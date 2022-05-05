package com.DLY.test;

public class test {
}
abstract class A{
    public void d(){
        a();
    }
    private void a(){
        System.out.println("hhhh1");
    }
}
class B extends A{
    @Override
    public void d() {

    }
}
