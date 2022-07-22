package com.zhou.bridge;

/**
 * @author zhoufuqi
 * @date 2022/7/22
 */
public class DishSugarEating extends SugarEating {

    public DishSugarEating(Taste taste) {
        super(taste);
    }

    protected void printDishEating() {
        System.out.println("炒菜吃法");
        super.printEating();
    }

}
