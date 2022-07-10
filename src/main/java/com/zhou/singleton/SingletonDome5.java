package com.zhou.singleton;

/**
 * 解决效率问题和懒加载
 * 双重检查单例设计模式 (完美解决线程不安全问题和执行效率问题)
 * 懒加载单例设计模式
 * 推荐使用
 *
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome5 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

class Singleton5 {

    private static volatile Singleton5 instance;

    //  私有构造方法
    private Singleton5() {
    }

    // 线程安全的创建对象的方法,解决效率问题
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    return new Singleton5();
                }
            }
        }
        return instance;
    }

}
