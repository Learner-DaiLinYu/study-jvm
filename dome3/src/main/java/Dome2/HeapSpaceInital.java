package Dome2;

/**
 * 1.设置堆空间大小的参数
 * -Xms 用来设置堆空间(年轻代和老年代)的初始内存大小
 * -X 是jvm的运行参数
 * -Xmx 用来设置堆空间(年轻代和老年代)的最大内存大小
 * 2.默认堆空间的大小
 *      初始内存大小：物理电脑内存大小 / 64
 *      最大内存大小: 物理电脑内存大小 / 4
 * 3.手动设置：-Xms 600m -Xmx 600m
 *      开发中建议将初始内存和最大的堆内存设置相同的值
 * 4.如何去查看 jps查看进程号   /  jstat -gc 进程 id
 *            方式二：-XX:+PrintGCDetails
 */
public class HeapSpaceInital {
    public static void main(String[] args) throws InterruptedException {
        //返回Java虚拟机的堆内存总量
        long l = Runtime.getRuntime().totalMemory() >> 10 >> 10;
        //返回Java系统使用的最大堆内存量
        long l1 = Runtime.getRuntime().maxMemory() >> 10 >> 10;
        System.out.println("-Xms: "+l+"M");
        System.out.println("-Xmx: "+l1+"M");
//        System.out.println("系统内存大小为:"+l*64.0/1024+"G");
//        System.out.println("系统内存大小为:"+l1*4.0/1024+"G");
        Thread.sleep(100000000);
    }
}
