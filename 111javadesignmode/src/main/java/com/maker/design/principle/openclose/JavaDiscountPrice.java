package com.maker.design.principle.openclose;
/*
 * @Author: zhangsp
 * @Date 2023/6/8 22:12
 * 继承父类JavaCourse，使用父类的构造器
 * 重写父类的getPrice()方法
 * 扩展方法getOriPrice()
 */
//继承父类JavaCourse
public class JavaDiscountPrice extends JavaCourse{
    //使用父类的构造器
    public JavaDiscountPrice(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //重写父类的getPrice()方法
    @Override
    public Double getPrice() {
        if(super.getPrice()>1000){
            return super.getPrice()*0.8;
        }else if(super.getPrice()>500){
            return super.getPrice()*0.7;
        }else{
            return super.getPrice();
        }

    }

    //扩展方法getOriPrice()
    public Double getOriPrice() {
        return super.getPrice();
    }

}
