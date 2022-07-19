package com.zhou.adaptor.interfaceAdaptor;

/**
 * 接口适配器模式,通过抽象类的实现接口方法的默认实现,来为调用方,自己覆盖自己需要的接口,而不需要重写所有的接口
 *
 * @author zhoufuqi
 * @date 2022/7/19 20:03
 */
public class Client {
    public static void main(String[] args) {
        AbsTeacherAdaptor adaptor = new AbsTeacherAdaptor() {
            @Override
            public void m1() {
                System.out.println("抽象接口的适配器模式");
            }
        };
        adaptor.m1();
    }
}
