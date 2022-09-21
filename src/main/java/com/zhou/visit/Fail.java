package com.zhou.visit;

/**
 * 具体的评价
 *
 * @author zhoufuqi
 * @date 2022/9/21
 */
public class Fail implements IAppraise {

    /**
     * 女人评价
     *
     * @param woman
     */
    @Override
    public void getResultWoman(Woman woman) {
        System.out.println("女人评价机场服务真差");
    }

    /**
     * 男人评价
     *
     * @param man
     */
    @Override
    public void getResultMan(Man man) {
        System.out.println("男人评价机场服务真差");
    }
}
