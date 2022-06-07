package com.zhou.designPrinciples.inversion;

/**
 * 违反口依赖原则
 * @author zhoufuqi
 * @date 2022/6/7
 */
public class DependencyInversionDemo1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXi());
    }
}

/**
 * 方式1
 * 1. 简单,方便
 * 2. 接收邮件消息, 一旦我需要接收短信 微信消息等功能时,接收消息时,则需要增加不同类,并且要新增方法
 * 这样导致代码稳定性和可扩展性降低
 * 解决方案: 通过引入一个抽象接口IReceive,表示接收者,这样Person类与接口进行依赖
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    public void receive(WeiXi weiXi){
        System.out.println(weiXi.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件: hello world";
    }
}

class WeiXi {
    public String getInfo(){
        return "微信: hello wx";
    }
}

