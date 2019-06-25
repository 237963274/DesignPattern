package com.kedian.design.pattern.behavioral.command;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.command
 * @Description:
 * @date 2019/6/25
 */
public class Client {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver=new Receiver();
        //创建命令对象，并设置它的接收者
        Command command=new ConcreteCommond(receiver);
        //创建调用者，将命令对象设置进去
        Invoker invoker=new Invoker(command);

        invoker.runCommand();
        invoker.unDoCommand();
    }
}
