package com.kedian.design.pattern.creational.simplefactory;

/**
 * @author wzh
 * @description 创建视频对象的工厂类
 * @create 2019-06-02 16:47
 */
public class VideoFactory {

    /**
     * 利用反射动态创建对象
     * @param c 对象
     * @return
     */
    public Video getVidio(Class c){
        Video video=null;
        try {
            video= (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    /**
     * 利用字符串判断创建对象的类型
     * @param type 创建对象的类型
     * @return
     */
    public Video getVidio(String type){
        //忽略大小写判断
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

}
