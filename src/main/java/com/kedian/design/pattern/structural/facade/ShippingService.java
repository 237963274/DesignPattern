package com.kedian.design.pattern.structural.facade;

/**
 * @Description: 物流服务，发送快递
 * @date 2019/6/12
 */
public class ShippingService {
    public String shipGift(PointGift pointGift){
        //物流系统对接
        System.out.println(pointGift.getName()+"进入物流系统");
        return "订单号:66633";
    }
}
