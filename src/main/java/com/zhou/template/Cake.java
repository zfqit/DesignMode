package com.zhou.template;

/**
 * @author zhoufuqi
 * @date 2022/9/19
 */
public abstract class Cake {

    /**
     * 制作蛋糕, 也就是通过模板组装蛋糕
     */
    final void production() {
        body();
        cream();
        // 钩子方法
        if (isIngredient()) {
            addIngredient();
        }
        packing();
    }

    public void body() {
        System.out.println("制作糕体");
    }

    /**
     * 钩子方法: 可以让子类去覆盖,来决定是否执行骨架中的执行逻辑
     *
     * @return
     */
    public boolean isIngredient() {
        return false;
    }

    public abstract void addIngredient();

    public void cream() {
        System.out.println("制作奶油");
    }

    public void packing() {
        System.out.println("包装蛋糕");
    }

}
