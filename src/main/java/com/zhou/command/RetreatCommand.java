package com.zhou.command;

/**
 * 撤退命令
 * @author zhoufuqi
 * @date 2022/9/20
 */
public class RetreatCommand implements ICommand {

    private Soldier soldier;

    public RetreatCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        soldier.retreat();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        soldier.attack();
    }
}
