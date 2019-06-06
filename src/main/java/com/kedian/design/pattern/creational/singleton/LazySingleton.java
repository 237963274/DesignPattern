package com.kedian.design.pattern.creational.singleton;

/**
 * @Description: 单例-懒汉式 线程不安全,只有使用时才创建
 * @date 2019/6/6
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        /*
         * 线程不安全，当第一个线程进入18行代码，还没new对象时，
         * 第二个线程判断lazySingleton依旧是null也会创建对象，从而破坏单例
         */
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 同步锁能保证线程安全，但对性能有影响，该锁直接将class锁住
     *synchronized 锁加在static静态方法上，相当于锁LazySingleton的class文件
     *synchronized 锁加在不是static静态方法上，相当于锁LazySingleton的在内存的堆对象
     * @return
     */
    public synchronized static LazySingleton getInstance1(){
        /*
        * 线程不安全，当第一个线程进入18行代码，还没new对象时，
        * 第二个线程判断lazySingleton依旧是null也会创建对象，从而破坏单例
         */
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

    //作用同上getInstance2，只是写法不同
    public static LazySingleton getInstance3(){
        synchronized (LazySingleton.class){
            /*
             * 线程不安全，当第一个线程进入18行代码，还没new对象时，
             * 第二个线程判断lazySingleton依旧是null也会创建对象，从而破坏单例
             */
            if (lazySingleton==null){
                lazySingleton=new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
