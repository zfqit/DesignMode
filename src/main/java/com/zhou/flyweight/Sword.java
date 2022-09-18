package com.zhou.flyweight;

/**
 * 具体共享类
 *
 * @author zhoufuqi
 * @date 2022/9/18 9:18
 */
public class Sword extends EquipmentAbstract {

    @Override
    public void useUserEquipment(User user) {
        System.out.println(user.getName() + "获取了剑这个装备");
    }

}
