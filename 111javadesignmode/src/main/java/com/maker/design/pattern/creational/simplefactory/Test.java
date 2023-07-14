package com.maker.design.pattern.creational.simplefactory;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/10 10:13
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //V2.0
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
        //V1.0
        /*
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();
        */
    }
}
