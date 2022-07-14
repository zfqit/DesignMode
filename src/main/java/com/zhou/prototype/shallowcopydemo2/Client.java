package com.zhou.prototype.shallowcopydemo2;


/**
 * 使用原型模式具体实现浅拷贝对象
 *
 * @author zhoufuqi
 * @date 2022/7/14 19:55
 */
public class Client {
    public static void main(String[] args) {
        User user = new User("小牛", 29);
        try {
            User user1 = (User) user.clone();
            System.out.println("user1 = " + user1 + "user1 = " + user1.hashCode());
            User user2 = (User) user.clone();
            System.out.println("user2 = " + user2 + "user2 = " + user2.hashCode());
            User user3 = (User) user.clone();
            System.out.println("user3 = " + user3 + "user3 = " + user3.hashCode());
            User user4 = (User) user.clone();
            System.out.println("user4 = " + user4 + "user4 = " + user4.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
