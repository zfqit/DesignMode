package com.zhou.bulider.improve;

/**
 * 具体建造者
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class UserLsBuilder extends AbstractUserBuilder {

    @Override
    protected void setName() {
        user.setName("李四");
    }

    @Override
    protected void setAge() {
        user.setAge("20");
    }
}
