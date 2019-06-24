package com.kedian.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.observer
 * @Description: 课程（被观测对象）
 * @date 2019/6/24
 */
public class Course extends Observable {
    private String courseName;

    public void produceQuestion(Question question){
        System.out.println(question.getUserName()+"，对课程："+courseName+"提了问题："+question.getQuestionContent());
        //被观察者改变状态
        setChanged();
        // 通知被观察者做相应的操作
        notifyObservers(question);
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
