package com.zhou.factory.absfactorydemo4.pizza;

/**
 * @author zhoufuqi
 * @date 2022/7/13
 */
public class Pizza {

    public String name;

    public void prepare() {
    }

    public void bake() {
        System.out.println("烘焙" + this.name);
    }

    public void cut() {
        System.out.println("切割" + this.name);
    }

    public void box() {
        System.out.println("打包" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
