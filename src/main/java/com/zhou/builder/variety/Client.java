package com.zhou.builder.variety;

/**
 * @author zhoufuqi
 * @date 2022/7/18
 */
public class Client {
    public static void main(String[] args) {
        User zs = new User.Builder().name("zs").age(19).build();
        System.out.println("zs = " + zs);
        User ls = new User.Builder().name("ls").age(20).build();
        System.out.println("ls = " + ls);
    }
}
