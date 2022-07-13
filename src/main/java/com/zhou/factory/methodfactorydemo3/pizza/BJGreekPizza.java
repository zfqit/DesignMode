package com.zhou.factory.methodfactorydemo3.pizza;


/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class BJGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("北京 准备希腊披萨原材料");
        super.setName("希腊披萨");
    }

}
