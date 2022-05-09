package matespaceDome;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * 产生方法区的oom
 * 1.通过反射产生大量的类
 * 2.借助CGLib式方法区溢出
 */
public class OOM extends ClassLoader{
    public static void main(String[] args) {
        int i=0;
        try {
            OOM oom = new OOM();
            for (int j = 0; j < 10000; j++) {
                //创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"Class"+i,null,"java/lang/Object",null);
                //返回byte[]数组
                byte[] bytes = classWriter.toByteArray();
                //类的加载
                oom.defineClass("Class"+i,bytes,0,bytes.length);
                i++;
            }
        } finally {
            System.out.println(i);
        }
    }
}
