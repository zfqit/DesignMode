package com.zhou.command;

/**
 * 空命令
 *
 * @author zhoufuqi
 * @date 2022/9/20
 */
public class NoCommand implements ICommand {

    private Soldier soldier;

    public NoCommand(Soldier soldier) {
        this.soldier = soldier;
    }


    /**
     * 执行
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销
     */
    @Override
    public void undo() {

    }
}
