package com.zhou.facade;

/**
 * 客户端
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.leisure();
        System.out.println("--------");
        homeFacade.goOut();
    }
}
