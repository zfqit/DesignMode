package com.zhou.factory.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 未使用工厂模式代码
 * 问题:
 *  1. 一旦使用新增不同种类的披萨,披萨订单类就要更改,而且如果要遵循开闭原则的话
 *  那就会产生多个披萨订单类,而一旦我们新增一个所有披萨订单类都需要的披萨种类的话
 *  就需要修改所有披萨订单类
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza;
        do {
            String type = getType();
            if ("greek".equals(type)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheess".equals(type)) {
                pizza = new CheessPizza();
                pizza.setName("乳酪披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
