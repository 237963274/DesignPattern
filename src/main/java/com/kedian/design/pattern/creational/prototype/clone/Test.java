package com.kedian.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.creational.prototype.clone
 * @Description:
 * @date 2019/6/12
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday=new Date(0L);
        Pig pig1=new Pig("佩奇", birthday);
        Pig pig2= (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        //对pig2重设生日
        pig2.getBirthday().setTime(666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
