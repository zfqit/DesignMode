package com.zhou.designPrinciples.inversion.imporve;

/**
 * 依赖倒转原则
 *
 * @author zhoufuqi
 * @date 2022/6/7
 */
public class DependencyInversionDemo3 {
    public static void main(String[] args) {
        // Setter 方法
        Person1 person = new Person1();
        person.setReceive(new WeiXi());
        person.receive1();

        // 构造器
        Person1 person1 = new Person1(new Email());
        person1.receive1();
    }
}

interface IReceive1 {
    String getInfo();
}

/**
 * 依赖方式: 通过参数传递实现依赖倒转
 */
class Person1 {
    private IReceive receive;

    /**
     * 通过构造器方式实现依赖倒转
     *
     * @param iReceive
     */
    public Person1(IReceive iReceive) {
        this.receive = iReceive;
    }

    public Person1() {
    }

    /**
     * 通过Setter方式实现依赖倒转
     *
     * @param iReceive
     */
    public void setReceive(IReceive iReceive) {
        this.receive = iReceive;
    }

    /**
     * 通过该方法实现set和构造器依赖倒转
     */
    public void receive1() {
        System.out.println(this.receive.getInfo());
    }


    public void receive(IReceive1 receive) {
        System.out.println(receive.getInfo());
    }


}

class Email1 implements IReceive1 {

    @Override
    public String getInfo() {
        return "电子邮件: hello world";
    }
}

class WeiXi1 implements IReceive1 {
    @Override
    public String getInfo() {
        return "微信: hello wx";
    }
}
