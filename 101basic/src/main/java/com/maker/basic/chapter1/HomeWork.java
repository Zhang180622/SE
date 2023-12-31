package com.maker.basic.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: maker
 * @date: 2023-06-17 18:07
 * @version: 1.0
 */
public class HomeWork {
    private static final Logger logger = LoggerFactory.getLogger(HomeWork.class);
    /*
        1、输出各种基本数据类型常量：整数四种进制、浮点数、字符、布尔、字符串；
        2、整数各进制数据转换；
        3、ASCII编码了解；
     */
    public static void main(String[] args) {
        homeWork1();
        logger.info("-------分隔符--------");
        homeWork3((byte)0x1F);
        logger.info("-------分隔符--------");
        homeWork3((byte)0x7C);
    }

    //输出各种基本数据类型的常量
    public static void homeWork1(){
        //整数 十进制
        logger.info(String.valueOf(10));
        //整数 二进制
        logger.info(String.valueOf(0b1001));
        //整数 十六进制
        logger.info(String.valueOf(0xF1));
        //整数 八进制
        logger.info(String.valueOf(017));
        //小数
        logger.info(String.valueOf(0.35));
        //布尔
        logger.info(String.valueOf(true));
        //字符
        logger.info(String.valueOf('中'));
        //字符串
        logger.info("UTF-8");
    }

    //10、2、16、8进制数字转换
    public static void homeWork2(){

    }

    //ASCII编码目前含0-127，共128个字符；byte范围-128-127刚好可用
    public static void homeWork3(byte charAt){
        if(charAt<0){
            return;
        }
        logger.info(String.valueOf((char)charAt));
    }

}
