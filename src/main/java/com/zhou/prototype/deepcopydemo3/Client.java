package com.zhou.prototype.deepcopydemo3;


/**
 * 深拷贝
 *
 * @author zhoufuqi
 * @date 2022/7/14 20:14
 */
public class Client {
    public static void main(String[] args) {
        // 通过 Cloneable 接口的 clone 方法实现深拷贝
        User user = new User("小牛", 29, new Dog("小花"));
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

        System.out.println("-------------------------------------------------------------");


        // 通过序列化实现深拷贝
        try {
            System.out.println(user.getDog().hashCode());
            User user5 = (User) user.deepClone();
            System.out.println("user5 = " + user5 + "user5 = " + user5.getDog().hashCode());
            User user6 = (User) user.deepClone();
            System.out.println("user6 = " + user6 + "user6 = " + user6.getDog().hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
