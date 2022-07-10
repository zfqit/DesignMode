package com.zhou.singleton;

/**
 * 解决效率问题,和懒加载问题
 * 静态内部类的方式创建单例设计模式
 * 懒加载单例设计模式
 * 推荐使用
 *
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome6 {
    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

class Singleton6 {

    // 静态内部内方式创建单例设计模式, 利用jdk 静态内部类特点
    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    //  私有构造方法
    private Singleton6() {
    }

    // 线程安全的创建对象的方法,解决效率问题
    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
