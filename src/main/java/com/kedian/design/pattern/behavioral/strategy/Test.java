package com.kedian.design.pattern.behavioral.strategy;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.strategy
 * @Description:
 * @date 2019/6/21
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        System.out.println("10+5=" + context.executeStrategy(10, 5));

        context = new Context(new SubstractStrategy());
        System.out.println("10-5=" + context.executeStrategy(10, 5));

        context = new Context(new MultiplyStrategy());
        System.out.println("10*5=" + context.executeStrategy(10, 5));
    }
}
