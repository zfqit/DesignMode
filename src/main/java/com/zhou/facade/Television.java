package com.zhou.facade;

/**
 * 子系统
 *
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Television {

    private static volatile Television instance;

    private Television() {
    }

    public static Television getInstance() {
        if (instance == null) {
            synchronized (Door.class) {
                if (instance == null) {
                    instance = new Television();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("打开电视");
    }

    public void off() {
        System.out.println("关闭电视");
    }

    public void pause() {
        System.out.println("暂停电视");
    }

    public void restore() {
        System.out.println("恢复暂停播放电视");
    }
}
