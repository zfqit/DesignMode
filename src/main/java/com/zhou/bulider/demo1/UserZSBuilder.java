package com.zhou.bulider.demo1;

/**
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class UserZSBuilder implements AbstractUserBuilder {

    @Override
    public User bulider() {
        User user = new User();
        user.setAge("18");
        user.setName("zs");
        return user;
    }
}
