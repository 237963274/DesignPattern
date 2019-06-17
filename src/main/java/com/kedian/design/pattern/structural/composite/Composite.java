package com.kedian.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 容器构件。
 * @date 2019/6/17
 */
public class Composite implements Component{
    private List<Component> list=new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void operate() {
        operate(list);
    }

    /**
     * 容器构件的操作：递归调用所有子节点的operate方法
     * @param list
     */
    private void operate(List<Component> list) {
        for (Component component : list) {
            try {
                component.operate();
            } catch (Exception e) {
                operate(component.getChild());
            }
        }
    }

    @Override
    public List<Component> getChild() {
        return this.list;
    }
}
