package com.kedian.design.pattern.structural.facade;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.structural.facade
 * @Description:
 * @date 2019/6/12
 */
public class Test {
    public static void main(String[] args){
        PointGift pointGift=new PointGift("笔记本");
        GiftExchangeService giftExchangeService=new GiftExchangeService();
        giftExchangeService.giftExchange(pointGift);
    }
}
