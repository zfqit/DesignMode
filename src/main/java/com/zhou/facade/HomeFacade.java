package com.zhou.facade;

/**
 * 外观模式,组织者, 具体是通过把具体实现类组合到本类中,由本类完成一系列操作
 *
 * @author zhoufuqi
 * @date 2022/9/16
 */
public class HomeFacade {

    private Door door;
    private Sofa sofa;
    private Television television;

    public HomeFacade() {
        this.door = Door.getInstance();
        this.sofa = Sofa.getInstance();
        this.television = Television.getInstance();
    }

    public void leisure() {
        door.on();
        television.on();
        sofa.lie();
    }

    public void goOut() {
        television.off();
        door.off();
    }

}
