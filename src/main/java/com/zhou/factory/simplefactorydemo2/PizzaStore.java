package com.zhou.factory.simplefactorydemo2;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class PizzaStore {
    public static void main(String[] args) {
        // 普通工厂
        //new OrderPizza(new SimpleFactory());
        // 静态工厂
        new OrderPizza2();
    }
}
