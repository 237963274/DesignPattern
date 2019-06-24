package com.kedian.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.observer
 * @Description: 观察者
 * @date 2019/6/24
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 观察到修需改动后执行方法
     * @param o 被观察对象
     * @param arg 参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course= (Course) o;
        Question question= (Question) arg;
        System.out.println(teacherName+"收到用户："+question.getUserName()+"对课程："+course.getCourseName()+"提问"+question.getQuestionContent());
    }
}
