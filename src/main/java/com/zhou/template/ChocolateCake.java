package com.zhou.template;

/**
 * @author zhoufuqi
 * @date 2022/9/19
 */
public class ChocolateCake extends Cake {

    @Override
    public void addIngredient() {
        System.out.println("添加巧克力");
    }

    /**
     * 钩子方法
     *
     * @return
     */
    @Override
    public boolean isIngredient() {
        return true;
    }
}
