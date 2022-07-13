package com.zhou.factory.methodfactorydemo3.pizza;


/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 伦敦 准备希腊披萨原材料");
        super.setName("希腊披萨");
    }

}
