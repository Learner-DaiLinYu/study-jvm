package com.DLY.lambda;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class dmoe1 {
    public static void main(String[] args) {
        dmoe1 dmoe1 = new dmoe1();
        new Thread(()->{
            dmoe1.xx();
        },"线程1").start();
        new Thread(()->{
            dmoe1.xx();
        },"线程2").start();
    }
    public void xx() {
       final Object o=new Object();
       synchronized(o){
           System.out.println("只有一个人可以进来");
           System.out.println(Thread.currentThread().getName()+"到了");
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
