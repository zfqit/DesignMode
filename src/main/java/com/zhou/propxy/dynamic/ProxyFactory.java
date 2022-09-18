package com.zhou.propxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 通过代理工厂生成动态代理对象, 通过 JDK 的 Proxy.newProxyInstance 方法
 *
 * @author zhoufuqi
 * @date 2022/9/18 11:07
 */
public class ProxyFactory {

    private Agent target;

    public ProxyFactory(Agent target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK动态生成代理对象开始");
            Object value = method.invoke(target, args);
            System.out.println("JDK动态生成代理对象结束");
            return value;
        });
    }

}
