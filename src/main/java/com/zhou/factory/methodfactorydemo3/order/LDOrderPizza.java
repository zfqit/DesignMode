package com.zhou.factory.methodfactorydemo3.order;

import com.zhou.factory.methodfactorydemo3.pizza.LDCheessPizza;
import com.zhou.factory.methodfactorydemo3.pizza.LDGreekPizza;
import com.zhou.factory.methodfactorydemo3.pizza.Pizza;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheess")) {
            pizza = new LDCheessPizza();
        } else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }

}
