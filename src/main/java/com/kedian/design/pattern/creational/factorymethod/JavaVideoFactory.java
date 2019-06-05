package com.kedian.design.pattern.creational.factorymethod;

/**
 * @author wzh
 * @description
 * @create 2019-06-02 22:07
 */
public class JavaVideoFactory extends VideoFactory{

    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
