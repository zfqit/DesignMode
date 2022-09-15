package com.zhou.decoration;

/**
 * 被装饰者的父类
 *
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class Wall extends Brush {

    @Override
    public void calculatePrice() {
        super.setPrice(super.getPrice());
    }

}
