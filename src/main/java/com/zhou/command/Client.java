package com.zhou.command;

/**
 * 客户端
 * @author zhoufuqi
 * @date 2022/9/20
 */
public class Client {
    public static void main(String[] args) {
        General general = new General();
        general.setCommand(3, new AttackCommand(new Soldier()));
        general.setCommand(4, new RetreatCommand(new Soldier()));
        System.out.println("执行士兵进攻命令");
        general.execute(3);
        System.out.println("撤销士兵进攻命令,则是撤退");
        general.undo();
    }
}
