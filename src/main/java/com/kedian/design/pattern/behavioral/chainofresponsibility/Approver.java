package com.kedian.design.pattern.behavioral.chainofresponsibility;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.chainofresponsibility
 * @Description: 审核批准者
 * @date 2019/6/25
 */
public abstract class Approver {
    //必须包含同样类型的对象
    protected Approver approver;
    //设置下一个校验者
    public void setNextApprover(Approver approver){
        this.approver=approver;
    }
    //校验
    public abstract void deploy(Course course);
}
