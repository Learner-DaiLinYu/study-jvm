package Dome2;

import java.util.ArrayList;

/**
 * 测试 Minor GC，Major GC，Full GC
 *
 * 参数:-Xmx9m -Xms9m -XX:+PrintGCDetails
 */
public class GCtest {
    public static void main(String[] args) {
        int i=0;
        try {
            ArrayList<String> list = new ArrayList<String>();
            String a="atguigu.com";
            while (true){
                list.add(a);
                a=a+a;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("遍历的次数："+i);
        }
    }
}
