package com.zhou.factory.absfactorydemo4.order;


import com.zhou.factory.absfactorydemo4.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象工厂模式
 * 工厂方法模式存在的问题:
 * 每生产一个对象,都需要创建一个产品对应的工厂类
 * 抽象工厂模式解决了工厂方法模式中的每一个产品对应一个工厂类的结构,而改变成每一个工厂类,只创建相同类型的产品,也就是树结构
 *
 * @author zhoufuqi
 * @date 2022/7/13 21:06
 */
public class OrderPizza {

    private AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        do {
            String type = getType();
            pizza = factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有这个类型的披萨");
                break;
            }
        } while (true);
    }


    private String getType() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入您要选购的披萨");
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
