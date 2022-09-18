package com.zhou.propxy.dynamic;

/**
 * @author zhoufuqi
 * @date 2022/9/18 11:11
 */
public class Client {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory(new User());
        Agent proxyInstance = (Agent) proxyFactory.getProxyInstance();
        proxyInstance.buy();

    }
}
