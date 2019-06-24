package com.kedian.design.pattern.behavioral.template;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.template
 * @Description: 板球运动
 * @date 2019/6/20
 */
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket 游戏初始化");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket 游戏开始");

    }

    @Override
    void endPlay() {
        System.out.println("Cricket 游戏结束");

    }
}
