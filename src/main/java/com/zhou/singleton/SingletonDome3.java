package com.zhou.singleton;

/**
 * 缺点: 多线程环境创建对象不安全,如 A B 线程同时进入if判断,则会创建两次实例
 * 懒加载单例设计模式
 * 不推荐使用
 *
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome3 {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

class Singleton3 {

    private static Singleton3 instance;

    //  私有构造方法
    private Singleton3() {
    }

    // 判断对象是否被创建,创建了就直接返回该对象,没有创建,则创建
    // 但是多线程环境不适用, 会照成线程不安全
    public static Singleton3 getInstance() {
        if (instance == null) {
            return new Singleton3();
        }
        return instance;
    }

}
