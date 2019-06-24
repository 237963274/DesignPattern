package com.kedian.design.pattern.behavioral.template;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.template
 * @Description: 模板模式
 * @date 2019/6/20
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    //模板:声明成final，让子类不能重写，只能执行模板定义好的流程
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
