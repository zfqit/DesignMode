package com.zhou.combinatorial;

/**
 * 客户端
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class Client {

    public static void main(String[] args) {
        OrganizationComponent company = new Company("恒大", "世界500强");

        OrganizationComponent operation = new Department("运营部", "负责公司产品的日常推广工作");
        OrganizationComponent technical = new Department("技术部", "负责公司产品的代码编写工作");

        operation.add(new Personnel("张世强", "牛的"));
        operation.add(new Personnel("罗永浩", "牛的"));

        technical.add(new Personnel("小飞", "编程"));

        company.add(operation);
        company.add(technical);

        company.print();
    }
}
