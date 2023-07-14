package com.maker.design.principle.openclose;
/*
 * @Author: zhangsp
 * @Date 2023/6/8 21:48
 * 实现ICourse接口，定义成员变量，构造器，实现接口方法
 */
//实现ICourse接口
public class JavaCourse implements ICourse{
    //定义实体类成员变量
    private Integer Id;
    private String name;
    private Double price;

    //成员变量构造器
    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    //实现接口getId()方法
    public Integer getId() {
        return this.Id;
    }

    //实现接口getName()方法
    public String getName() {
        return this.name;
    }

    //实现接口getPrice()方法
    public Double getPrice() {
        return this.price;
    }
}
