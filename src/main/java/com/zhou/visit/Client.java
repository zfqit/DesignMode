package com.zhou.visit;

/**
 * 客户端
 *
 * @author zhoufuqi
 * @date 2022/9/21
 */
public class Client {
    public static void main(String[] args) {
        Appraiser appraiser = new Appraiser();
        appraiser.attach(new Woman());
        appraiser.attach(new Man());

        Success success = new Success();
        appraiser.display(success);

        Fail fail = new Fail();
        appraiser.display(fail);
    }
}
