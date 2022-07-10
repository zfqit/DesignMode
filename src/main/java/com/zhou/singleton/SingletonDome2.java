package com.zhou.singleton;

/**
 * 缺点: 不是懒加载, 如果没有用到该对象,会照成内存浪费, 单线程(推荐)
 * 饿汉式(静态代码块)单例设计模式
 * 单线程推荐使用
 *
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

class Singleton2 {

    private static final Singleton2 instance;

    // 在静态代码块中直接创建对象
    static {
        instance = new Singleton2();
    }

    //  私有构造方法
    private Singleton2() {
    }

    // 提供方法返回单例对象
    public static Singleton2 getInstance() {
        return instance;
    }

}
