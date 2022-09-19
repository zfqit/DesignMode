package com.zhou.template;

/**
 * @author zhoufuqi
 * @date 2022/9/19
 */
public class StrawberryCake extends Cake {

    @Override
    public void addIngredient() {
        System.out.println("添加草莓");
    }

    /**
     * 钩子方法: 可以让子类去覆盖,来决定是否执行骨架中的执行逻辑
     *
     * @return
     */
    @Override
    public boolean isIngredient() {
        return true;
    }
}
