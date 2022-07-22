package com.zhou.bridge;

/**
 * 糖的吃法的抽象类
 * 桥接模式
 * 桥接对象
 *
 * @author zhoufuqi
 * @date 2022/7/22
 */
public abstract class SugarEating {

    private Taste taste;

    public SugarEating(Taste taste) {
        this.taste = taste;
    }

    protected void printEating() {
        taste.printTaste();
    }

}
