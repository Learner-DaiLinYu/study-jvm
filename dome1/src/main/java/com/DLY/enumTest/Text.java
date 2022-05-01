package com.DLY.enumTest;

import java.util.HashMap;

public enum Text {
    ONE,TOW;
    private String str=null;
    private Text(){
        System.out.println("私有的无参构造运行");
        str = new String("我还是我吗");
        System.out.println("b3");
    }
    public String getStr(){
        return str;
    }
}
