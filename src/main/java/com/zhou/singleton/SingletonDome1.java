package com.zhou.singleton;

/**
 * 缺点: 不是懒加载, 如果没有用到该对象,会照成内存浪费, 单线程(推荐)
 * 饿汉式(静态成员属性)单例设计模式
 * 单线程推荐使用
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

class Singleton1 {

    // 在属性中直接创建对象
    private static final Singleton1 instance = new Singleton1();

    //  私有构造方法
    private Singleton1() {
    }

    // 提供方法返回单例对象
    public static Singleton1 getInstance() {
        return instance;
    }

}
