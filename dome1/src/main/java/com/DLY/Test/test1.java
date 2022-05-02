package com.DLY.Test;

public class test1 {
    private static int num=1;

    /**
     *首先会全部初始化为默认值 0
     * 按照顺序来执行静态static的内容
     */
    static {
        System.out.println("---------"+test1.test);   // 0
        System.out.println("========="+test1.num);   // 1
        num=2;
        number=20;
    }
    private static int test=5;
    private static int number=10; //在linking时的准备阶段 number-->0 随后代码顺序执行 20 --->10

    public static void main(String[] args) {
        System.out.println(test1.num);
        System.out.println(test1.number);
        System.out.println(test1.test);
    }
}
