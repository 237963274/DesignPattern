package com.kedian.design.pattern.creational.factorymethod;

/**
 * @author wzh
 * @description
 * @create 2019-06-02 22:08
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    Video getVideo() {
        return new PythonVideo();
    }
}
