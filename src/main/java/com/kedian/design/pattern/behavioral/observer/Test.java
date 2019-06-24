package com.kedian.design.pattern.behavioral.observer;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.observer
 * @Description:
 * @date 2019/6/24
 */
public class Test {
    public static void main(String[] args) {
        //被观察者
        Course course=new Course("java课程");
        //观察者
        Teacher teacher1=new Teacher("LOMO");
        Teacher teacher2=new Teacher("jeck");
        course.addObserver(teacher1);
        course.addObserver(teacher2);
        //业务逻辑代码
        Question question=new Question();
        question.setUserName("tom");
        question.setQuestionContent("java中thread如何使用");
        //对课程提问
        course.produceQuestion(question);
    }
}
