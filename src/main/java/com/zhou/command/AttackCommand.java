package com.zhou.command;

/**
 * 进攻命令
 * @author zhoufuqi
 * @date 2022/9/20
 */
public class AttackCommand implements ICommand {

    private Soldier soldier;

    public AttackCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        soldier.attack();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        soldier.retreat();
    }
}
