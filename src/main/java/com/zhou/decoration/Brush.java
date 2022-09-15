package com.zhou.decoration;

/**
 * 被装饰者的抽象, 并定义行为
 * 装饰者例子: 墙 与 颜色装饰
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public abstract class Brush {

    /**
     * 被装饰者描述
     */
    protected String description;

    /**
     * 价格
     */
    protected Double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 定义计算价格的行为
     */
    public abstract void calculatePrice();
}
