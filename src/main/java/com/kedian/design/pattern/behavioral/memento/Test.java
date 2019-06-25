package com.kedian.design.pattern.behavioral.memento;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.memento
 * @Description:
 * @date 2019/6/25
 */
public class Test {

    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();
        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #4");
        System.out.println("当前状态 state："+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一次保存 state："+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次保存 state："+originator.getState());

    }
}
