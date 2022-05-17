package com.DLY.Reference;

import java.lang.ref.WeakReference;

/**
 * 弱引用
 */
public class WeakReferenceText {
    public static void main(String[] args) {
        Object o = new Object();
        WeakReference weakReference = new WeakReference(o);
        System.out.println(weakReference.get());
        o=null;
        System.gc();
        //弱引用的对象  在下一次垃圾回收之前必定被回收
        System.out.println(weakReference.get());  //null
    }
}
