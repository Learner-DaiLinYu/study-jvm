package com.DLY.Dome;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Text {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        /**
         * 创建一测试bean用来赋值
         */
        DlyBean text = new DlyBean();
        System.out.println(text);
        //1. 通过new对象实现反射机制（ 对象.getClass() ）
        //2. 通过路径实现反射机制（ Class.forName("包名.类名") ）
        //3. 通过类名实现反射机制 （ 类名.Class ）
        //4. 通过类加载器xxxClassLoader.loadClass()传入类路径获取：通过类加载器获取 Class 对象不会进行初始化，意味着不进行包括初始化等一系列步骤，静态代码块和静态对象不会得到执行
        Class<DlyBean> dlyBeanClass = DlyBean.class;
        Method setName = dlyBeanClass.getMethod("setName",String.class);
        /**
         * 获取私有属性    getDeclaredField
         * 获取public属性 getField
         */
        Field name = dlyBeanClass.getDeclaredField("name");
        /**
         * 获取注解
         */
        DlyAnnotation annotationMethod = setName.getAnnotation(DlyAnnotation.class);
        DlyAnnotation annotationField = name.getAnnotation(DlyAnnotation.class);

//        System.out.println(annotationField.value());
//        System.out.println(annotationMethod.value());

//        name.setAccessible(true);  //对私有属性进行爆破
//        name.set(text,annotationField.value());
        setName.invoke(text,annotationMethod.value());

        System.out.println(text);
    }
}
