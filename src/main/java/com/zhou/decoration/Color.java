package com.zhou.decoration;

/**
 * 具体实现装饰的类的基类,负责计算价格, 也就是装饰者
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class Color extends Brush {

    /**
     * 被装饰对象, 通过组合
     */
    protected Brush brush;

    public Color(Brush brush) {
        this.brush = brush;
    }

    /**
     * 计算价格
     */
    @Override
    public void calculatePrice() {
        price = brush.getPrice() + this.price;
    }
}
