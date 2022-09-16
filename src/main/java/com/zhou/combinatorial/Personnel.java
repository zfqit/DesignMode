package com.zhou.combinatorial;

/**
 * 叶子节点
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Personnel extends OrganizationComponent {

    public Personnel(String name, String descrition) {
        super(name, descrition);
    }

    @Override
    public void print() {
        System.out.println("姓名:" + getName());
    }
}
