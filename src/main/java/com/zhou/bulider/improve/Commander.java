package com.zhou.bulider.improve;

/**
 * 指挥者
 *
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class Commander {

    private AbstractUserBuilder bulider;

    public Commander(AbstractUserBuilder bulider) {
        this.bulider = bulider;
    }

    public User build() {
        bulider.setName();
        bulider.setAge();
        return bulider.getResult();
    }
}
