package com.zhou.factory.demo1;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备希腊披萨原材料");
    }

}