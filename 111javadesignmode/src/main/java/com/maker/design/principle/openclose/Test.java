package com.maker.design.principle.openclose;
/*
 * @Author: zhangsp
 * @Date 2023/6/8 21:48
 *
 */
public class Test {
    public static void main(String[] args) {
        JavaDiscountPrice javaDiscountPrice = new JavaDiscountPrice(12, "API接口自动化测试", 2000d);
        System.out.print("课程ID："+javaDiscountPrice.getId()+
                " 课程名称："+javaDiscountPrice.getName()+
                " 课程原价格："+javaDiscountPrice.getOriPrice()+
                " 课程折后价格："+javaDiscountPrice.getPrice());
    }
}
