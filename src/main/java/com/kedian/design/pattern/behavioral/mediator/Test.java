package com.kedian.design.pattern.behavioral.mediator;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.mediator
 * @Description:
 * @date 2019/6/25
 */
public class Test {
    public static void main(String[] args) {
        User tom=new User("tom");
        User jeck=new User("jeck");
        tom.sendMessage("jeck 下午5点操场集合");
        jeck.sendMessage("收到消息");
    }
}
