package com.zhou.decoration;

/**
 * 装饰对象
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class Red extends Color {

    public Red(Brush brush) {
        super(brush);
        super.setPrice(50d);
        super.setDescription("红色");
        super.calculatePrice();
    }
}
