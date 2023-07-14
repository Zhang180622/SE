package com.maker.design.pattern.creational.factorymethod;

/* *
 * @Author: zhangsp
 * @Date: 2023/6/10 10:08
 * @Version: 1.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制PYTHON视频");
    }
}
