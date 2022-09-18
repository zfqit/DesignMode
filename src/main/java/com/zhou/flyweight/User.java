package com.zhou.flyweight;

/**
 * 外部状态, 则是不共享区域
 *
 * @author zhoufuqi
 * @date 2022/9/18 9:19
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
