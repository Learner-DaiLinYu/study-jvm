package com.DLY;

public class LocalVarGC {
    public void Local1(){
        byte[] buffer=new byte[10*1024*1024];
        System.gc();
    }
    public void Local2(){
        byte[] buffer=new byte[10*1024*1024];
        buffer=null;
        System.gc();
    }
    public void Local3(){
        {
            byte[] buffer=new byte[10*1024*1024];  //局部变量表 this和buffer
        }
        System.gc(); //局部变量表 this和 buffer buffer还存在局部变量表的引用无法删除
    }
    public void Local4(){
        {
            byte[] buffer=new byte[10*1024*1024];  //局部变量表 this和buffer
        }
        int value=4;  //局部变量表 this和buffer  覆盖buffer  ==> //局部变量表 this和value
        System.gc();   //可以清除buffer
    }

    public static void main(String[] args) {
        LocalVarGC localVarGC = new LocalVarGC();
        localVarGC.Local4();
    }
}
