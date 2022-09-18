package com.zhou.propxy.staticPropxy;

/**
 * @author zhoufuqi
 * @date 2022/9/18 11:02
 */
public class Client {
    public static void main(String[] args) {
        ProxyAgent proxyAgent = new ProxyAgent(new User());
        proxyAgent.buy();
    }
}
