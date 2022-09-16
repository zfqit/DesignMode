package com.zhou.facade;

/**
 * 子系统
 *
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Sofa {

    private static volatile Sofa instance;

    private Sofa() {
    }

    public static Sofa getInstance() {
        if (instance == null) {
            synchronized (Door.class) {
                if (instance == null) {
                    instance = new Sofa();
                }
            }
        }
        return instance;
    }


    public void sit() {
        System.out.println("坐沙发");
    }

    public void lie() {
        System.out.println("躺沙发");
    }

}
