package com.zhou.factory.abstractfactorydemo3.order;

import com.zhou.factory.abstractfactorydemo3.pizza.BJCheessPizza;
import com.zhou.factory.abstractfactorydemo3.pizza.BJGreekPizza;
import com.zhou.factory.abstractfactorydemo3.pizza.Pizza;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheess")) {
            pizza = new BJCheessPizza();
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }

}
