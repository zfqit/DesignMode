package com.zhou.factory.abstractfactorydemo3.order;


/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loh = "ld";
        if (loh.equals("bj")) {
            // 工厂方法创建北京披萨
            new BJOrderPizza();
        } else if (loh.equals("ld")) {
            // 工厂方法创建伦敦披萨
            new LDOrderPizza();
        }
    }
}
