package com.zhou.factory.absfactorydemo4.order;


/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
