package com.zhou.factory.methodfactorydemo3.order;

import com.zhou.factory.methodfactorydemo3.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法模式
 * 工厂方法模式是为了解决简单工厂模式不同的同类型的工厂类创建的产品内容不同
 * 如: 北京的披萨和伦敦的披萨,他的用料和做法有些不同
 * 通过工厂方法模式把创建对象的权限下放到具体抽象中(如通过继承抽奖类中的方法)
 * 从而达到不同地区的披萨创建的产品不同的问题
 *
 * 缺点: 每一种产品都需要创建对应的工厂类来生成对应产品
 *
 * @author zhoufuqi
 * @date 2022/7/13
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String type);

    public OrderPizza() {
        Pizza pizza = null;
        do {
            String type = getType();
            pizza = createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("您想要的披萨不存在");
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
