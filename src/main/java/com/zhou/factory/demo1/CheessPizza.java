package com.zhou.factory.demo1;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class CheessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨原材料");
    }

}
