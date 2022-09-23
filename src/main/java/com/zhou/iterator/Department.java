package com.zhou.iterator;

import java.util.List;

/**
 * @author zhoufuqi
 * @date 2022/9/23
 */
public class Department extends Organization {

    private List<Person> persons;

    public Department(String name) {
        super(name);
    }

}
