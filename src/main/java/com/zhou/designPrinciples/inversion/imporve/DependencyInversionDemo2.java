package com.zhou.designPrinciples.inversion.imporve;

/**
 * 依赖倒转原则
 * @author zhoufuqi
 * @date 2022/6/7
 */
public class DependencyInversionDemo2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXi());
    }
}

interface IReceive {
    String getInfo();
}

/**
 * 方式 2
 * 使用依赖倒转原则,可以让被依赖类中不新增方法,使程序的稳定性提高和扩展性提高
 */
class Person {
    public void receive(IReceive receive) {
        System.out.println(receive.getInfo());
    }
}

class Email implements IReceive {

    @Override
    public String getInfo() {
        return "电子邮件: hello world";
    }
}

class WeiXi implements IReceive{
    @Override
    public String getInfo() {
        return "微信: hello wx";
    }
}
