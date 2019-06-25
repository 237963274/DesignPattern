package com.kedian.design.pattern.behavioral.mediator;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.mediator
 * @Description: 用户
 * @date 2019/6/25
 */
public class User {
    private String name;

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message );
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
