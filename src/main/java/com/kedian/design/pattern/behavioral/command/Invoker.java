package com.kedian.design.pattern.behavioral.command;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.command
 * @Description: 调用者
 * @date 2019/6/25
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    //执行命令
    public void runCommand(){
        command.execute();
    }

    //撤销命令
    public void unDoCommand(){
        command.undo();
    }
}
