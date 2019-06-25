package com.kedian.design.pattern.behavioral.command;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.command
 * @Description: 命令实现者
 * @date 2019/6/25
 */
public class ConcreteCommond implements Command {
    //命令要求的功能的真正实现者
    private Receiver receiver;

    public ConcreteCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.unAction();
    }
}
