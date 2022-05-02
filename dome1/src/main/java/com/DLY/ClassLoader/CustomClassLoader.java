package com.DLY.ClassLoader;

import java.io.FileNotFoundException;

/**
 * 自定义的类加载实现
 */
public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFormCustomPath(name);
            if(result==null){
                throw new FileNotFoundException();
            }else{
                return defineClass(name,result,0,result.length);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }
    private byte[] getClassFormCustomPath(String name){
        //从自定义路径中加载指定的类：细节略
        //如果指定路径的字节码文件进行了加密，则需要在这个方法中进行解密
        return null;
    }
}
