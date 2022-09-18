package com.zhou.propxy.cglib;

/**
 * @author zhoufuqi
 * @date 2022/9/18 11:34
 */
public class Client {
    public static void main(String[] args) {
        User proxyInstance = (User) new ProxyFactory(new User()).getProxyInstance();
        proxyInstance.buy();
    }
}
