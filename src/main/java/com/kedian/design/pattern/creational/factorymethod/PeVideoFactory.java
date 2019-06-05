package com.kedian.design.pattern.creational.factorymethod;

/**
 * @author wzh
 * @description
 * @create 2019-06-02 22:09
 */
public class PeVideoFactory extends VideoFactory{

    @Override
    Video getVideo() {
        return new PeVideo();
    }
}
