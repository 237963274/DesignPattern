package com.kedian.design.principle.openclose;

/**
 * @author wzh
 * @create 2019-06-01 23:01
 */
public class Test {
    public static void main(String[] args) {
//        ICourse iCourse=new JavaCourse(96,"Java开发课程",348d);
        ICourse iCourse=new JavaDiscountCourse(96,"Java开发课程",348d);
        System.out.println("课程ID："+iCourse.getId()+"，课程名称："+iCourse.getName()+"，课程价格："+iCourse.getPrice());
        //注意接口是没有getOriginPrice方法，只有在实现类JavaDiscountCourse中有，需要类型强转
        JavaDiscountCourse javaDiscountCourse=(JavaDiscountCourse) iCourse;
        System.out.println("课程原价："+javaDiscountCourse.getOriginPrice());
    }
}
