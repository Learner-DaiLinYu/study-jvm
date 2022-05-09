package Dome2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 堆空间溢出
 */
public class OOM {
    public static void main(String[] args) {
        ArrayList<Picture> pictures = new ArrayList<>();
        new Thread(()->{
            while (true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pictures.add(new Picture(new Random().nextInt(1024*1024)));
            }
        },"线程1").start();
    }
}
class Picture{
    private byte[] pixels;
    public Picture(int length){
        this.pixels=new byte[length];
    }
}