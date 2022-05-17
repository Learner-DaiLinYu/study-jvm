package com.DLY;

public class SystemGC {
    public static void main(String[] args) {
        new SystemGC();
        System.gc();  //只是提醒Jvm的垃圾回收器执行GC，但是不确定马上执行
        //底层Runtime.getRuntime().gc()
        System.runFinalization();  //强制调用不可引用对象的finalize方法
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("SystemGC重写了finalize方法！！！");
    }
}
