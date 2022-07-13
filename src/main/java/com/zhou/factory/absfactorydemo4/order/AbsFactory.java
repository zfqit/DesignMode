package com.zhou.factory.absfactorydemo4.order;

import com.zhou.factory.absfactorydemo4.pizza.Pizza;

/**
 * 抽象工厂类
 */
public interface AbsFactory {
    Pizza createPizza(String type);
}
