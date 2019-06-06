package com.kedian.design.pattern.creational.singleton;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.creational.singleton
 * @Description:多线程
 * @date 2019/6/6
 */
public class T implements Runnable{

    @Override
    public void run() {
        //懒加载
//        LazySingleton instance=LazySingleton.getInstance();
        //double check
//        LazyDoubleCheckSingleton instance=LazyDoubleCheckSingleton.getInstance();
        //静态内部类
        StaticInnerClassSingleton instance=StaticInnerClassSingleton.getInstace();


        System.out.println(Thread.currentThread().getName()+"  "+instance);

    }
}
