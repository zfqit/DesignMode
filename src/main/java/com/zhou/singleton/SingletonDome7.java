package com.zhou.singleton;

/**
 * 枚举创建单例设计模式
 * 懒加载单例设计模式
 * 推荐使用
 *
 * @author zhoufuqi
 * @date 2022/7/10 12:57
 */
public class SingletonDome7 {
    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance2 = " + instance2.hashCode());
        System.out.println("instance2 = " + instance2.hashCode());
    }
}

enum Singleton7 {
    INSTANCE;

    public static Singleton7 getInstance() {
        System.out.println("INSTANCE = ok ");
        return INSTANCE;
    }


}
