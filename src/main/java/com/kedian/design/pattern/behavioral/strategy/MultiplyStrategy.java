package com.kedian.design.pattern.behavioral.strategy;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.strategy
 * @Description: 乘法策略
 * @date 2019/6/21
 */
public class MultiplyStrategy implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
