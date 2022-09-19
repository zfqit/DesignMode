package com.zhou.template;

/**
 * 模板模式
 *
 * @author zhoufuqi
 * @date 2022/9/19
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("巧克力蛋糕制作方式");
        Cake chocolateCake = new ChocolateCake();
        chocolateCake.production();

        System.out.println("草莓蛋糕制作方式");
        StrawberryCake strawberryCake = new StrawberryCake();
        strawberryCake.production();

        System.out.println("普通蛋糕制作方式");
        OrdinaryCake ordinaryCake = new OrdinaryCake();
        ordinaryCake.production();

    }
}
