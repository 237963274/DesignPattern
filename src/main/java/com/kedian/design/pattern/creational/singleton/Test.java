package com.kedian.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.creational.singleton
 * @Description:
 * @date 2019/6/6
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton=LazySingleton.getInstance();
        Thread t1=new Thread(new T());
        Thread t2=new Thread(new T());
        t1.start();
        t2.start();
        //主意t1,t2开启后，现在三个线程在执行，外加一个主线程
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("program end");
        //序列化破坏
        /*HungrySingleton instance=HungrySingleton.getInstance();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file=new File("singleton_file");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance= (HungrySingleton) ois.readObject();*/
        /*
         *反射破坏单例
         */
        /*Class objectClass=HungrySingleton.class;
        Constructor constructor=objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton instance=HungrySingleton.getInstance();
        HungrySingleton newInstance= (HungrySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);*/
    }
}
