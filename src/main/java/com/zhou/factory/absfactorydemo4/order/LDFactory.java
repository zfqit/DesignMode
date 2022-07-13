package com.zhou.factory.absfactorydemo4.order;

import com.zhou.factory.absfactorydemo4.pizza.LDCheessPizza;
import com.zhou.factory.absfactorydemo4.pizza.LDGreekPizza;
import com.zhou.factory.absfactorydemo4.pizza.Pizza;


/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheess")) {
            pizza = new LDCheessPizza();
        } else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
