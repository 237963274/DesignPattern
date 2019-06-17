package com.kedian.design.pattern.structural.facade;

/**
 * @Description: 校验积分数量够不够，有没有库存等
 * @date 2019/6/12
 */
public class QualifyService {
    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验"+pointGift.getName()+"积分资格通过,库存通过");
        return true;
    }
}
