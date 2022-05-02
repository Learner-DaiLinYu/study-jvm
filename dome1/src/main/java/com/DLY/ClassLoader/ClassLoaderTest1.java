package com.DLY.ClassLoader;

import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("========启动类加载器=========");
        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url:urls) {
            System.out.println(url.toExternalForm());
        }
        //从上面的路径中随机选择一个类，来看看他的类加载器是什么
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);  //null

        System.out.println("==========扩展类加载器==========");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path:extDirs.split(";")){
            System.out.println(path);
        }
        System.out.println(CurveDB.class.getClassLoader());//sun.misc.Launcher$ExtClassLoader@61bbe9ba
    }
}
