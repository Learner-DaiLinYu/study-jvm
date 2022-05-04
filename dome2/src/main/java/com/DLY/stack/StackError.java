package com.DLY.stack;

/**
 * 演示栈中的异常：StackOverflowError
 * 默认情况下：9864
 * 设置栈的大小256k之后：2221
 */
public class StackError {
    private static int count=1;
    public static void main(String[] args) {
        System.out.println(count++);
        //java.lang.StackOverflowError异常
        main(args);
    }
}
