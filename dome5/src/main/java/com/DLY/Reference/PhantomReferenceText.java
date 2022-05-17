package com.DLY.Reference;


import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 幽灵(虚)引用
 */
public class PhantomReferenceText {
    private static PhantomReferenceText p;
    private static ReferenceQueue<PhantomReferenceText> pqueue;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("复活该对象");
        p = this;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                if(pqueue!=null) {
                    PhantomReference<PhantomReferenceText> pt = null;
                    try {
                        pt = (PhantomReference<PhantomReferenceText>) pqueue.remove();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (pt != null) {
                        System.out.println("追踪信息，PhantomReference被GC了");
                    }
                }
            }
        }, "线程开启");
        thread.setDaemon(true); //设置守护线程
        thread.start();

        p = new PhantomReferenceText();
        pqueue = new ReferenceQueue<>();
        PhantomReference<PhantomReferenceText> phantomReference = new PhantomReference<PhantomReferenceText>(p, pqueue);

        try {
            //不可获取虚引用的对象
            System.out.println(phantomReference.get());  //null

            p = null;  //去除强引用
            System.gc();  //清除 p
            Thread.sleep(1000);  //保证先触发GC
            if (p == null) {
                System.out.println("p == null");
            } else {
                System.out.println("p != null");
            }

            System.out.println("发生第二次GC");
            p = null;
            System.gc();
            Thread.sleep(1000);
            if (p == null) {
                System.out.println("p == null");
            } else {
                System.out.println("p != null");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}