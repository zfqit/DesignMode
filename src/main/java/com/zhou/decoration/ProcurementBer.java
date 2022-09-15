package com.zhou.decoration;

/**
 * @author zhoufuqi
 * @date 2022/9/15
 */
public class ProcurementBer {

    public static void main(String[] args) {
        Brush order = new WoodWall();
        System.out.println("购买一个" + order.getDescription() + "价格为:" + order.getPrice());

        order = new Green(order);
        System.out.println("购买一个" + order.getDescription() + "和购买1个绿色价格为:" + order.getPrice());

        order = new Green(order);
        System.out.println("购买一个" + order.getDescription() + "和购买2个绿色价格为:" + order.getPrice());

        order = new Red(order);
        System.out.println("购买一个" + order.getDescription() + "和购买2个绿色和购买1个红色价格为:" + order.getPrice());

    }
}
