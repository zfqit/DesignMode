package com.zhou.factory.abstractfactorydemo3.pizza;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class BJCheessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("北京 准备奶酪披萨原材料");
        super.setName("奶酪披萨");
    }


}
