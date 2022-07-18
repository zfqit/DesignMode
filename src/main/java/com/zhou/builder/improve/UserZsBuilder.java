package com.zhou.builder.improve;

/**
 * 具体建造者
 *
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class UserZsBuilder extends AbstractUserBuilder {

    @Override
    protected void setName() {
        user.setName("张三");
    }

    @Override
    protected void setAge() {
        user.setAge("18");
    }

}
