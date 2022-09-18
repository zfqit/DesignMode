package com.zhou.flyweight;

/**
 * 用户获取装备案例
 * @author zhoufuqi
 * @date 2022/9/18 9:28
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        flyweightFactory.getEquipmentUserAndType(new User("张三"), "bow");
        flyweightFactory.getEquipmentUserAndType(new User("王五"), "bow");

        flyweightFactory.getEquipmentUserAndType(new User("李四"), "sword");
        flyweightFactory.getEquipmentUserAndType(new User("熊大"), "sword");

        System.out.println("共享区域创建了" + flyweightFactory.getEquipmentSize() + "次");
    }
}
