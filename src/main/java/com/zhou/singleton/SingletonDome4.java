package com.zhou.singleton;

/**
 * 线程安全的单例设计模式
 * 懒加载单例设计模式
 * 不推荐使用
 *
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome4 {
    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

class Singleton4 {

    private static Singleton4 instance;

    //  私有构造方法
    private Singleton4() {
    }

    // 线程安全的创建对象的方法
    // 但是会造成性能问题,因为每一个线程进入都需要加锁,解锁, 而我们只需要第一次线程加锁,后续不需要
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            return new Singleton4();
        }
        return instance;
    }

}
