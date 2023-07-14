package com.maker.basic.chapter1;

/** 练习进制之间互相转换
 *2/8进制   ->    10进制.       口诀 : 按位权(2,8)展开,相加.
 *10进制    ->    2进制.        口诀 : 除二取余,倒序排列法.
 *10进制    ->    8进制.        口诀 : 除八取余,倒序排列法.
 *2进制     ->    16进制.       口诀 : 四合一法.
 *16进制    ->    2进制.        口诀 : 一拆四法.
 *2进制     ->    8进制.        口诀 : 三合一法.
 *8进制     ->    2进制.        口诀 : 一拆三法.
 *10进制    ->    16进制.       特殊转换方式 : 十进制 -> 二进制 -> 十六进制.
 *8进制     ->    16进制.       特殊转换方式 : 八进制 -> 二进制 -> 十六进制.
 */
public class HexSwitchDemo {

    public static void main(String[] args) {
        System.out.println(hex_10Switch2(10));
    }

    //二进制转其它进制
    /**
     * 2-->>8: 三合一法
     * @param num 入参二进制数字
     * @return 返回值，八进制数字
     */
    public static int hex_2Switch8(int num){

        return 0;
    }
    /**
     * 2-->>10: 按位权2展开，相加
     * @param num 入参二进制数字
     * @return 返回值，十进制数字
     */
    public static int hex_2Switch10(int num){

        return 0;
    }
    /**
     * 2-->>16: 四合一法
     * @param num 入参二进制数字
     * @return 返回值，十六进制数字
     */
    public static int hex_2Switch16(int num){

        return 0;
    }


    //八进制转其它进制
    /**
     * 8-->>2: 一拆三法
     * @param num
     * @return
     */
    public static int hex_8Switch2(int num){

        return 0;
    }
    /**
     * 8-->>10: 按位权8展开，相加
     * @param num
     * @return
     */
    public static int hex_8Switch10(int num){

        return 0;
    }
    /**
     * 8-->>16: 8转2，2转16
     * @param num
     * @return
     */
    public static int hex_8Switch16(int num){

        return 0;
    }


    //十进制转其它进制
    /**
     * 10-->>2: 除2取余,倒序排列法
     * @param num
     * @return
     */
    public static String hex_10Switch2(int num){
        String returnNum = "";
        while((num / 2) > 0){
            returnNum = (num % 2) + returnNum;
            num = num / 2;
        }
        if(num == 1)returnNum = 1 + returnNum;
        return returnNum;
    }
    /**
     * 10-->>8: 除8取余,倒序排列法
     * @param num
     * @return
     */
    public static int hex_10Switch8(int num){

        return 0;
    }
    /**
     * 10-->>16: 10转2，2转16
     * @param num
     * @return
     */
    public static int hex_10Switch16(int num){

        return 0;
    }


    //十六进制转其它进制
    /**
     * 16-->>2:一拆四法
     * @param num
     * @return
     */
    public static int hex_16Switch2(int num){

        return 0;
    }
    /**
     * 16-->>8:16转2，2转8
     * @param num
     * @return
     */
    public static int hex_16Switch8(int num){

        return 0;
    }
    /**
     * 16-->>10:16转2，2转10
     * @param num
     * @return
     */
    public static int hex_16Switch10(int num){

        return 0;
    }
}
