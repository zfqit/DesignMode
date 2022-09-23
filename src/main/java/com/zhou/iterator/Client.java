package com.zhou.iterator;

/**
 * 客户端
 *
 * @author zhoufuqi
 * @date 2022/9/23
 */
public class Client {
    public static void main(String[] args) {
        // 迭代器模式
        CompanyIterator companyIterator = new CompanyIterator();
        companyIterator.add(new Department("技术部"));
        companyIterator.add(new Department("研发部"));
        companyIterator.add(new Department("产品部"));
        while (companyIterator.hasNext()) {
            System.out.println(companyIterator.next());
        }

        DepartmentIterator departmentIterator = new DepartmentIterator();
        departmentIterator.add(new Person("王小美"));
        departmentIterator.add(new Person("王小方"));
        while (departmentIterator.hasNext()) {
            System.out.println(departmentIterator.next());
        }
    }
}
