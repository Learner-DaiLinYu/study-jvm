package com.DLY.ClassLoader;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@58644d46
        //获取其上层，扩展类加载器   不是继承关系
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@6d6f6e28
        //获取器上层   这里获取不到引导类加载器进行加载
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        //对于用户之自定义的类是由谁来进行加载的:默认使用的系统类加载的
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@58644d46

        //String类使用引导类加载器进行加载的-----> Java的核心类库都是都是使引导类加载器加载的
        ClassLoader stringclassLoader = String.class.getClassLoader();
        System.out.println(stringclassLoader);//null
    }
}
