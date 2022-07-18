package com.zhou.bulider.demo1;

/**
 * 没使用建造者模式创建不用用户的方式,因为每个用户的姓名年龄都可能不一样
 * 所以导致没创建一个不同对象,都需要实现抽象接口,从而实现不同用户的创建
 *
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class Client {
    public static void main(String[] args) {
        User zsUser = new UserZSBuilder().bulider();
        System.out.println("zsUser = " + zsUser);
    }
}
