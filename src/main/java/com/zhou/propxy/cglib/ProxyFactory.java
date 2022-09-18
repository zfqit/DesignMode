package com.zhou.propxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 生成代理对象工厂
 *
 * @author zhoufuqi
 * @date 2022/9/18 11:28
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        enhancer.setClassLoader(target.getClass().getClassLoader());
        return enhancer.create();
    }

    /**
     * 额外功能
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLib 动态生成代理对象开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("CGLib 动态生成代理对象结束");
        return invoke;
    }

}
