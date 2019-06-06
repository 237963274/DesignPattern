package com.kedian.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Description:饿汉式
 * @date 2019/6/6
 */
public class HungrySingleton implements Serializable {
//    private final static HungrySingleton hungrySingleton=new HungrySingleton();
    //上面等同于下面静态代码块
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton=new HungrySingleton();
    }

    private HungrySingleton(){
        //反射防御
        if (hungrySingleton!=null){
            throw new RuntimeException("单例对象构造函数禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //解决序列化破坏单例问题
    private Object readResolve(){
        return hungrySingleton;
    }
}
