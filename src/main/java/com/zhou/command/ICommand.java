package com.zhou.command;

/**
 * 抽象的命令接口,提供执行和撤销的抽象方法
 *
 * @author zhoufuqi
 * @date 2022/9/20
 */
public interface ICommand {

    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
