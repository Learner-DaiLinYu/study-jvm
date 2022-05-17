package com.DLY.Reference;

import java.lang.ref.SoftReference;

/**
 * 软引用
 */
public class SoftReferenceText {
    public static void main(String[] args) {
        Object o = new Object();
        SoftReference<Object> objectSoftReference = new SoftReference<>(o);
        System.out.println(objectSoftReference.get());
        o=null;
        System.gc();  //无法回收objectSoftReference
        //系统将要发生内存溢出之前，会将这些对象列入回收范围之中进行第二次回收，如果这些回收后还没有足够内存，才会抛出内存溢出异常
        System.out.println(objectSoftReference.get());

        try {
            byte[] bytes = new byte[1024 * 1024 * 1024];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(objectSoftReference.get());  //null
        }
    }
}
