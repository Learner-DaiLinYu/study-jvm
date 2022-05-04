package com.DLY.stack;

public class StackTest {
    public void methodA(){
        int i=1;
        int j=9;
        System.out.println(i+j);
    }
    private void methodB(){
        int k=10;
        int o=10;
        System.out.println(k+o);
    }

    public static void main(String[] args) {

        StackTest stackTest = new StackTest();
        stackTest.methodA();
        stackTest.methodB();

    }
}
