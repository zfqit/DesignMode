package com.zhou.propxy.staticPropxy;

/**
 * 被代理用户
 *
 * @author zhoufuqi
 * @date 2022/9/18 11:00
 */
public class User implements Agent {

    @Override
    public void buy() {
        System.out.println("我要买房");
    }

}
