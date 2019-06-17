package com.kedian.design.pattern.structural.composite;

import java.util.List;

/**
 * @Description: 叶子构件，不支持add、remove、getChild等方法，此处直接抛异常
 * @date 2019/6/17
 */
public class Leaf implements Component{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持此方法");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持此方法");

    }

    @Override
    public void operate() {
        System.out.println("叶子节点操作"+name);
    }

    @Override
    public List<Component> getChild() {
        throw new UnsupportedOperationException("叶子节点不支持此方法");
    }
}
