package com.zhou.factory.simplefactorydemo2;


/**
 * 简单工厂模式,也叫静态工厂模式
 * 1. 通过简单工厂模式, 把披萨订单类创建对象的放到工厂中创建对象了,
 * 以后如果有多个订单类,都可以使用工厂类来创建对象,一旦新增不同种类或者修改种类
 * 则只需要修改工厂类即可,避免了要修改多个披萨订单类的问题
 *
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class SimpleFactory {

    /**
     * 普通工厂
     *
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheess".equals(type)) {
            pizza = new CheessPizza();
            pizza.setName("乳酪披萨");
        }
        return pizza;
    }


    /**
     * 静态工厂
     *
     * @param type
     * @return
     */
    public static Pizza createPizza2(String type) {
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheess".equals(type)) {
            pizza = new CheessPizza();
            pizza.setName("乳酪披萨");
        }
        return pizza;
    }
}