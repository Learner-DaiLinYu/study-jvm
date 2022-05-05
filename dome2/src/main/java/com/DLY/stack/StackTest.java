package com.DLY.stack;

public class StackTest {
    static {
        System.out.println(StackTest.a);
    }
    private static int a=1;
    public void methodA(){
        int i=1;
        int j=9;
        System.out.println(i+j);
    }
    private void methodB(){
        int k=10;
        {
            int x=k++;
        }
        //变量使用之前已经销毁的变量x占据的slot的位置
        int o=10;
        System.out.println(k+o);
    }

    public static void main(String[] args) {

        StackTest stackTest = new StackTest();
        stackTest.methodA();
        stackTest.methodB();

    }
}
