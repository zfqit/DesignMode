package com.zhou.factory.absfactorydemo4.order;

import com.zhou.factory.absfactorydemo4.pizza.BJCheessPizza;
import com.zhou.factory.absfactorydemo4.pizza.BJGreekPizza;
import com.zhou.factory.absfactorydemo4.pizza.Pizza;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheess")) {
            pizza = new BJCheessPizza();
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }

}
