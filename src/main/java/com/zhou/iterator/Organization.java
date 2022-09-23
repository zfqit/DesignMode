package com.zhou.iterator;

/**
 * @author zhoufuqi
 * @date 2022/9/23
 */
public class Organization {

    private String name;

    public Organization(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                '}';
    }
}
