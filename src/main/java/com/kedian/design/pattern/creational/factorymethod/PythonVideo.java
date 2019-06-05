package com.kedian.design.pattern.creational.factorymethod;

/**
 * @author wzh
 * @description java视频
 * @create 2019-06-02 16:52
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
