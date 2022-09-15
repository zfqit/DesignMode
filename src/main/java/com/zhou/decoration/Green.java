package com.zhou.decoration;

/**
 * 装饰对象
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class Green extends Color {

    public Green(Brush brush) {
        super(brush);
        super.setDescription("绿色");
        super.setPrice(20d);
        super.calculatePrice();
    }
}
