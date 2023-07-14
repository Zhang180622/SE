package com.maker.design.pattern.creational.simplefactory;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/10 10:12
 * @Version: 1.0
 */
public class VideoFactory {
    public Video getVideo(Class c){
        //V2.0
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
        //V1.0
        /*
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
        */
    }
}
