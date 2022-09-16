package com.zhou.facade;

/**
 * 子系统
 *
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Door {

    private static volatile Door instance;

    private Door() {
    }

    public static Door getInstance() {
        if (instance == null) {
            synchronized (Door.class) {
                if (instance == null) {
                    instance = new Door();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("开门");
    }

    public void off() {
        System.out.println("关门");
    }
}
