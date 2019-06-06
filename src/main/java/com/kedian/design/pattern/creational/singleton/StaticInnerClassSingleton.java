package com.kedian.design.pattern.creational.singleton;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Description: 静态内部类的单例模式
 *
 * @date 2019/6/6
 */
public class StaticInnerClassSingleton {
    //私有构造器，防止外部能new,不写的话默认public
    private StaticInnerClassSingleton(){

    }

    //class 对象的初始化锁
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstace(){
        return InnerClass.staticInnerClassSingleton;
    }
}

