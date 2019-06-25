package com.kedian.design.pattern.behavioral.memento;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.memento
 * @Description: 备忘录模式
 * @date 2019/6/25
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
