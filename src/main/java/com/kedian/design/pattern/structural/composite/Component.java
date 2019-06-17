package com.kedian.design.pattern.structural.composite;

import java.util.List;

/**
 * @Description: 抽象构件
 * @date 2019/6/17
 */
public interface Component {
    void add(Component component);

    void remove(Component component);

    void operate();

    List<Component> getChild();
}
