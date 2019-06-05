package com.kedian.design.principle.openclose;

/**
 * @author wzh
 * @create 2019-06-01 23:10
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取当前价格，即打折后价格
     * @return
     */
    @Override
    public Double getPrice(){
        return super.getPrice()*0.8;
    }

    /**
     * 获取原价
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }
}
