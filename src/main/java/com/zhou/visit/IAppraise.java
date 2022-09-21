package com.zhou.visit;

/**
 * 评价接口, 提供两种不同的评价方式
 *
 * @author zhoufuqi
 * @date 2022/9/21
 */
public interface IAppraise {

    /**
     * 女人评价
     *
     * @param woman
     */
    void getResultWoman(Woman woman);

    /**
     * 男人评价
     *
     * @param man
     */
    void getResultMan(Man man);
}
