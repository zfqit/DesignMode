package com.zhou.builder.variety;

/**
 * 建造者模式变种,通过静态内部类来创建不同用户
 * 静态内部类的角色: 具体建造者.指挥者
 *
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class User {

    private String name;
    private Integer age;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static final class Builder {
        private String name;
        private Integer age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
