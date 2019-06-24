package com.kedian.design.pattern.behavioral.template;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.template
 * @Description:
 * @date 2019/6/20
 */
public class Test {

    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();
        System.out.println("---------------------");
        game=new Football();
        game.play();
    }
}
