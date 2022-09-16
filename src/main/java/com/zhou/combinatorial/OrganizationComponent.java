package com.zhou.combinatorial;

/**
 * 组织模式
 * 组织控件, 主要是该类组织并定义了行为
 *
 * @author zhoufuqi
 * @date 2022/9/16
 */
public abstract class OrganizationComponent {

    /**
     * 组织名字或成员名字
     */
    private String name;

    /**
     * 描述
     */
    private String descrition;


    public OrganizationComponent(String name, String descrition) {
        this.name = name;
        this.descrition = descrition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    /**
     * 因为叶子节点不需要该方法,所以不定义为抽象方法
     * 添加
     *
     * @param organizationComponent
     */
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 因为叶子节点不需要该方法,所以不定义为抽象方法
     * 删除
     *
     * @param organizationComponent
     */
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 抽象打印方法
     */
    public abstract void print();

}
