package com.maker.design.pattern.creational.factorymethod;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/11 8:35
 * @Version: 1.0
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
