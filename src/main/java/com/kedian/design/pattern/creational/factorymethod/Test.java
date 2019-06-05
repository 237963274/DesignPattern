package com.kedian.design.pattern.creational.factorymethod;

/**
 * @author wzh
 * @description 测试简单工厂
 * @create 2019-06-02 16:57
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory javaVideoFactory=new JavaVideoFactory();
        Video javaVideo=javaVideoFactory.getVideo();
        javaVideo.produce();

        VideoFactory pythonVideoFactory=new PythonVideoFactory();
        Video pythonVideo=pythonVideoFactory.getVideo();
        pythonVideo.produce();

        VideoFactory peVideoFactory=new PeVideoFactory();
        Video peVideo=peVideoFactory.getVideo();
        peVideo.produce();
    }
}
