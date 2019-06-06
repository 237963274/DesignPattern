package com.kedian.design.pattern.creational.singleton;

/**
 * @Description:
 * @date 2019/6/6
 */
public class LazyDoubleCheckSingleton {
    /*
    1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
　　2）禁止进行指令重排序。
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        synchronized (LazyDoubleCheckSingleton.class){
            if (lazyDoubleCheckSingleton==null){
                lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                /* 1.分配内存给这个对象
                 * 3.设置lazyDoubleCheckSingleton 指向刚分配的内存空间
                 * 2.初始化对象
                 *      intra-thread semantics
                 */
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
