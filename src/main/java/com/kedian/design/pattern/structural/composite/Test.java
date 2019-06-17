package com.kedian.design.pattern.structural.composite;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.structural.composite
 * @Description:
 * @date 2019/6/17
 */
public class Test {

    public static void main(String[] args){
        /**
         *      测试属性结构如下
         *              A
         *           /    \
         *      leafA1   compositeB
         *               /        \
         *           leafB      compositeC
         *                     /          \
         *                  leafC1      leafC2
         */
        Component leafC1=new Leaf("leafC1");
        Component leafC2=new Leaf("leafC2");
        Component componentC=new Composite();
        componentC.add(leafC1);
        componentC.add(leafC2);
        Component leafB=new Leaf("leafB");
        Component componentB=new Composite();
        componentB.add(leafB);
        componentB.add(componentC);
        Component leafA1=new Leaf("leafA1");
        Component componentA=new Composite();
        componentA.add(leafA1);
        componentA.add(componentB);
        //调用顶层容器构件的operate方法，打印所有构件的operate方法
        componentA.operate();
    }
}
