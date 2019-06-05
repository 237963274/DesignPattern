package com.kedian.design.pattern.creational.simplefactory;

/**
 * @author wzh
 * @description java视频
 * @create 2019-06-02 16:52
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
