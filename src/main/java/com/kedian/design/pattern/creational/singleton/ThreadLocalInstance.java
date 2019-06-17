package com.kedian.design.pattern.creational.singleton;

/**
 * @Description: ThreadLocal单例
 * @date 2019/6/11
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL
            =new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){}

    public static ThreadLocalInstance getInstance(){
        return THREAD_LOCAL.get();
    }
}
