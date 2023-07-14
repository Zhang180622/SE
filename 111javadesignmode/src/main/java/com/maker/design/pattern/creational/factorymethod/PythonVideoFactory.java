package com.maker.design.pattern.creational.factorymethod;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/11 8:36
 * @Version: 1.0
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
