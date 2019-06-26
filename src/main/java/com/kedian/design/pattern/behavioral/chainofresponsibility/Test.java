package com.kedian.design.pattern.behavioral.chainofresponsibility;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.chainofresponsibility
 * @Description:
 * @date 2019/6/25
 */
public class Test {

    public static void main(String[] args) {
        Approver articleApprover=new ArticleApprover();
        Approver videoApprover=new VideoApprover();
        Course course=new Course();
        course.setName("java设计模式");
//        course.setArticle("手记");
        course.setVideo("视频");
        //先审计手记，再审核视频
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
