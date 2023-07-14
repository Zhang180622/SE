package com.maker.design.pattern.creational.factorymethod;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/10 10:13
 * @Version: 1.0
 * @comment: 工厂方法 by ohs
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
