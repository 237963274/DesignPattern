package com.kedian.design.pattern.structural.facade;

/**
 * @Description: 积分兑换服务，对外公开
 * @date 2019/6/12
 */
public class GiftExchangeService {
    private QualifyService qualifyService=new QualifyService();
    private PointsPaymentService pointsPaymentService=new PointsPaymentService();
    private ShippingService shippingService=new ShippingService();
    //积分兑换礼物
    public void giftExchange(PointGift pointGift){
        //1.检验资格
        if (qualifyService.isAvailable(pointGift)){
            //2.扣减积分
            if (pointsPaymentService.pay(pointGift)){
                //3.物流下单
                shippingService.shipGift(pointGift);
            }
        }
    }
}
