package com.zhou.visit;

/**
 * 具体评价
 *
 * @author zhoufuqi
 * @date 2022/9/21
 */
public class Man extends Person {


    /**
     * 1. 使用了双分派机制 IAppraise 子类中使用依赖了具体的人, 这就是第一层分派
     * 2. Person 类中委派方法又把子类自身的 this(状态) 传入这样就实现了第二次分派
     *
     * @param appraise
     */
    @Override
    public void access(IAppraise appraise) {
        appraise.getResultMan(this);
    }

}
