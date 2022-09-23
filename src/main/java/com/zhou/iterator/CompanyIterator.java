package com.zhou.iterator;

import java.util.Iterator;

/**
 * 迭代器模式是实现 Iterator 接口,并重写 next hasNext remove 方法来实现遍历不同类型的数据
 * 如: 集合 数组 ...
 *
 * @author zhoufuqi
 * @date 2022/9/23
 */
public class CompanyIterator implements Iterator {

    /**
     * 部门
     */
    private Department[] departments;

    private int index = -1;

    private int cursor = 0;

    public CompanyIterator() {
        departments = new Department[5];
    }

    public void add(Department department) {
        departments[cursor] = department;
        cursor += 1;
    }

    @Override
    public boolean hasNext() {
        if (index > departments.length || departments[index + 1] == null) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = this.departments[index];
        return department;
    }

    @Override
    public void remove() {

    }

}
