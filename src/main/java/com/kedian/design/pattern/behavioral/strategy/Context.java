package com.kedian.design.pattern.behavioral.strategy;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.strategy
 * @Description: Context 是一个使用了某种策略的类。
 * @date 2019/6/21
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1, num2);
    }
}
