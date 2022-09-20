package com.zhou.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 将军
 * @author zhoufuqi
 * @date 2022/9/20
 */
public class General {

    private ICommand revoke;

    private List<ICommand> commands = new ArrayList<>();

    public General() {
        // 初始化命令3个命令
        Soldier soldier = new Soldier();
        commands.add(new RetreatCommand(soldier));
        commands.add(new AttackCommand(soldier));
        commands.add(new NoCommand(soldier));
    }

    public void setCommand(int index, ICommand command) {
        if (commands.size() -1  < index) {
            commands.add(command);
            return;
        }
        commands.set(index, command);
    }

    /**
     * 执行命令
     *
     * @param index 命令代号
     */
    public void execute(int index) {
        ICommand iCommand = commands.get(index);
        iCommand.execute();
        // 记录执行的命令
        revoke = iCommand;
    }

    /**
     * 撤销命令
     */
    public void undo() {
        revoke.undo();
    }

}