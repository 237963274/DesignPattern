package com.kedian.design.pattern.creational.singleton;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.creational.singleton
 * @Description:
 * @date 2019/6/6
 */
public class TestVolatile {

    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final TestVolatile test = new TestVolatile();
        for(int i=0;i<5;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }

        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}
