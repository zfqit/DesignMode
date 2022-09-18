package com.zhou.flyweight;

import java.util.HashMap;

/**
 * @author zhoufuqi
 * @date 2022/9/18 9:22
 */
public class FlyweightFactory {

    /**
     * 共享对象集合
     */
    private static HashMap<String, EquipmentAbstract> equipments = new HashMap<>();

    /**
     * 初始化共享对象
     */
    static {
        equipments.put("sword", new Sword());
        equipments.put("bow", new Bow());
    }

    /**
     * 获取共享类
     *
     * @param user 用户
     * @param type 类型
     * @return
     */
    public EquipmentAbstract getEquipmentUserAndType(User user, String type) {
        EquipmentAbstract equipmentAbstract = equipments.get(type);
        equipmentAbstract.useUserEquipment(user);
        return equipmentAbstract;
    }

    /**
     * 获取共享类创建次数
     *
     * @return
     */
    public int getEquipmentSize() {
        return equipments.size();
    }

}
