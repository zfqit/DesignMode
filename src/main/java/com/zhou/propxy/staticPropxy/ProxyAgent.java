package com.zhou.propxy.staticPropxy;

/**
 * 具体代理类
 *
 * @author zhoufuqi
 * @date 2022/9/18 11:01
 */
public class ProxyAgent implements Agent {

    private Agent target;

    public ProxyAgent(Agent target) {
        this.target = target;
    }

    @Override
    public void buy() {
        System.out.println("中介处理买房前的事务");
        target.buy();
        System.out.println("中介处理买房后的事务");
    }
}
