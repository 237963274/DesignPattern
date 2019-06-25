package com.kedian.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.mediator
 * @Description: 中介类,聊天室
 * @date 2019/6/25
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+" ["+user.getName()+" ]:"+message);
    }
}
