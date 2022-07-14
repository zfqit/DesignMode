package com.zhou.prototype.deepcopydemo3;

import java.io.Serializable;

/**
 * @author zhoufuqi
 * @date 2022/7/14 20:05
 */
public class Dog implements Cloneable, Serializable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * 使用 Clone 方法实现深拷贝
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
