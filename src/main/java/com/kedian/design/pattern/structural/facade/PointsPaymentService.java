package com.kedian.design.pattern.structural.facade;

/**
 * @Description: 积分扣减服务
 * @date 2019/6/12
 */
public class PointsPaymentService {
    public boolean pay(PointGift pointGift){
        System.out.println("支付"+pointGift.getName()+" 积分成功");
        return true;
    }
}
