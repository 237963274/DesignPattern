package com.kedian.design.pattern.behavioral.template;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.template
 * @Description: 足球运动
 * @date 2019/6/20
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football 游戏初始化");
    }

    @Override
    void startPlay() {
        System.out.println("Football 游戏开始");
    }

    @Override
    void endPlay() {
        System.out.println("Football 游戏结束");
    }
}
