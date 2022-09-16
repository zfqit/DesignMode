package com.zhou.combinatorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 部件/枝条节点
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Company extends OrganizationComponent {

    /**
     * 部门
     */
    private List<OrganizationComponent> departments = new ArrayList<>();

    public Company(String name, String descrition) {
        super(name, descrition);
    }

    @Override
    public void print() {
        System.out.println("公司名称: " + getName());
        for (OrganizationComponent department : departments) {
            department.print();
        }
    }

    /**
     * 因为叶子节点不需要该方法,所以不定义为抽象方法
     * 添加
     *
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        departments.add(organizationComponent);
    }

    /**
     * 因为叶子节点不需要该方法,所以不定义为抽象方法
     * 删除
     *
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        departments.remove(organizationComponent);
    }

}
