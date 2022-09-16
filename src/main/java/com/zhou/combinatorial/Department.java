package com.zhou.combinatorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 部件/枝条节点
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Department extends OrganizationComponent {

    private List<OrganizationComponent> personnels = new ArrayList<>();

    public Department(String name, String descrition) {
        super(name, descrition);
    }

    /**
     * 因为叶子节点不需要该方法,所以不定义为抽象方法
     * 添加
     *
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        personnels.add(organizationComponent);
    }

    /**
     * 因为叶子节点不需要该方法,所以不定义为抽象方法
     * 删除
     *
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        personnels.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("部门名称:" + getName());
        for (OrganizationComponent personnel : personnels) {
            personnel.print();
        }
    }
}
