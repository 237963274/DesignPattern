package com.kedian.design.pattern.behavioral.iterator;

/**
 * @author wuzh
 * @version V1.0
 * @Package com.kedian.design.pattern.behavioral.iterator
 * @Description:
 * @date 2019/6/20
 */
public class Test {

    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        for (Iterator iterator=nameRepository.getIterator();iterator.hasNext();){
            String name= (String) iterator.next();
            System.out.println("name:"+name);
        }
    }
}
