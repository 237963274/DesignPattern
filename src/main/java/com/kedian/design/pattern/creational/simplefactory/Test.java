package com.kedian.design.pattern.creational.simplefactory;

/**
 * @author wzh
 * @description 测试简单工厂
 * @create 2019-06-02 16:57
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory factory=new VideoFactory();
        //利用方法名
        Video video=factory.getVidio("Java");
        if (video==null){
            return;
        }
        video.produce();
        //反射
        Video videoReflect=factory.getVidio(PythonVideo.class);
        if (videoReflect==null){
            return;
        }
        videoReflect.produce();
    }
}
