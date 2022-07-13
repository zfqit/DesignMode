package com.zhou.factory.simplefactorydemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 简单工厂模式 静态工厂
 * 1. 通过简单工厂模式, 把披萨订单类创建对象的放到工厂中创建对象了,
 * 以后如果有多个订单类,都可以使用工厂类来创建对象,一旦新增不同种类或者修改种类
 * 则只需要修改工厂类即可,避免了要修改多个披萨订单类的问题
 *
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class OrderPizza2 {

    /**
     * 静态工厂创建
     */
    public OrderPizza2() {
        Pizza pizza = null;
        do {
            String type = getType();
            pizza = SimpleFactory.createPizza2(type);
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
