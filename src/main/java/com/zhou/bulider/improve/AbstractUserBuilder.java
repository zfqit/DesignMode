package com.zhou.bulider.improve;

/**
 * 抽象建造者
 *
 * @author zhoufuqi
 * @date 2022/7/18
 */
public abstract class AbstractUserBuilder {

    protected  User user = new User();

    protected abstract void setName();

    protected abstract void setAge();

    public User getResult() {
        return this.user;
    }

}
