package com.DLY.Test;

public class test3 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=()->{
            System.out.println(Thread.currentThread().getName()+"开始行动");
            DeadThread deadThread=new DeadThread();
            System.out.println(Thread.currentThread().getName()+"执行完毕");
        };
        Thread thread1 = new Thread(runnable,"线程1");
        Thread thread2 = new Thread(runnable,"线程2");
        thread1.start();
        thread2.start();

//        Thread.sleep(5000);

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        Thread.sleep(5000);

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }

}
class DeadThread{
    static {
        if(true) {
            System.out.println(Thread.currentThread().getName() + "正在初始化该类");
            while (true) {

            }
        }
    }
}