package com.kedian.design.pattern.behavioral.memento;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.memento
 * @Description:
 * @date 2019/6/25
 */
public class Originator {
    private String state;

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
