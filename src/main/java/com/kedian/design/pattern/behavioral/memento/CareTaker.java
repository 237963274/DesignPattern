package com.kedian.design.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.memento
 * @Description: Caretaker 对象负责从 Memento 中恢复对象的状态
 * @date 2019/6/25
 */
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();
    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
