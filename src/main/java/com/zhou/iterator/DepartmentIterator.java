package com.zhou.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式是实现 Iterator 接口,并重写 next hasNext remove 方法来实现遍历不同类型的数据
 * 如: 集合 数组 ...
 *
 * @author zhoufuqi
 * @date 2022/9/23
 */
public class DepartmentIterator implements Iterator {

    private List<Person> persons;
    private int index = 0;

    public DepartmentIterator() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    @Override
    public boolean hasNext() {
        if (persons == null || persons.size() == index) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public Object next() {
        Person person = persons.get(index);
        index += 1;
        return person;
    }

    @Override
    public void remove() {
    }
}
