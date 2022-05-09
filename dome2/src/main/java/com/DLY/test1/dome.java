package com.DLY.test1;

public class dome {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                throw new RuntimeException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "守护线程");
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(4000);
        System.out.println("回函后");
    }
}
