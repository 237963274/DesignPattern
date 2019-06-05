package com.kedian.design.pattern.creational.factorymethod;

/**
 * @author wzh
 * @description
 * @create 2019-06-02 22:09
 */
public class PeVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Pe课程视频");
    }
}
