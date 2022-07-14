package com.zhou.prototype.demo1;

/**
 * 未使用原型模式创建相同对象
 *
 * @author zhoufuqi
 * @date 2022/7/14 19:48
 */
public class Client {
    public static void main(String[] args) {
        User user = new User("小牛", 29);
        User user1 = new User(user.getName(), user.getAge());
        System.out.println("user1 = " + user1);
        User user2 = new User(user.getName(), user.getAge());
        System.out.println("user2 = " + user2);
        User user3 = new User(user.getName(), user.getAge());
        System.out.println("user3 = " + user3);
        User user4 = new User(user.getName(), user.getAge());
        System.out.println("user4 = " + user4);
    }
}
