package com.maker.design.pattern.creational.simplefactory;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/10 10:06
 * @Version: 1.0
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制JAVA视频");
    }
}
