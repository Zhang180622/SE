package com.maker.basic.chapter1;//包名com.course.day01，所有字母小写

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author: maker
 * @date: 2023-06-17 11:20
 * @version: 1.0
 * @comment: HelloWorld
 */
//类名HelloWorld，大驼峰命名
public class HelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public static void main(String[] args){
        logger.info("Hello World!");
    }
}
