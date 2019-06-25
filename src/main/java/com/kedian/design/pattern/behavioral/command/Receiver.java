package com.kedian.design.pattern.behavioral.command;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.command
 * @Description: 命令接受者，命令真正的执行人
 * @date 2019/6/25
 */
public class Receiver {
    public void action(){
        System.out.println("执行命令");
    }
    public void unAction(){
        System.out.println("撤销命令");
    }
}
