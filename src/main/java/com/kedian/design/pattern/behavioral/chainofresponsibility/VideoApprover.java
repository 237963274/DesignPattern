package com.kedian.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.chainofresponsibility
 * @Description:
 * @date 2019/6/25
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneBlank(course.getArticle())){
            System.out.println(course.getName()+"含有视频，审核通过");
            //在链上看还有不要其他的校验
            if(approver!=null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"没有视频，审核不通过");
        }
    }
}
