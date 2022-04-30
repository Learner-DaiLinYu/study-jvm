package com.DLY.enumTest;

public enum Text {
    ONE,TOW;
    private String str=null;
    private Text(){
        System.out.println("私有的无参构造运行");
        str = new String("我还是我吗");
    }
    public String getStr(){
        return str;
    }
}
