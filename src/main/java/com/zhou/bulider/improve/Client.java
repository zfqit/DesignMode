package com.zhou.bulider.improve;

/**
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class Client {
    public static void main(String[] args) {
        // 通过指挥者传入不同的建造者创建不同类型的产品
        User zs = new Commander(new UserZsBuilder()).build();
        User ls = new Commander(new UserLsBuilder()).build();
        System.out.println("ls = " + ls);
        System.out.println("zs = " + zs);
    }
}
