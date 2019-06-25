package com.kedian.design.pattern.behavioral.command;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.command
 * @Description: 命令模式
 * @date 2019/6/25
 */
public interface Command {
    //执行命令
    void execute();
    //撤销命令
    void undo();
}
