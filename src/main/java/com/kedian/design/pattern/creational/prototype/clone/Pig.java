package com.kedian.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.creational.prototype.clone
 * @Description: 理解深克隆和浅克隆
 * @date 2019/6/12
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        //默认浅克隆
        return super.clone();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig= (Pig) super.clone();
        // 深克隆
        pig.birthday= (Date) pig.birthday.clone();
        return pig;
    }
}
