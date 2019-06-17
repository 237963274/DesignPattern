package com.kedian.design.pattern.structural.facade;

/**外观模式
 * @Description: 积分礼物
 * @date 2019/6/12
 */
public class PointGift {
    private String name;

    public PointGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
