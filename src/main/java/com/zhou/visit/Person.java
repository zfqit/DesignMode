package com.zhou.visit;

/**
 * 评价的人, 提供一个访问接口,访问评价
 *
 * @author zhoufuqi
 * @date 2022/9/21
 */
public abstract class Person {

    /**
     * 1. 使用了双分派机制 IAppraise 子类中使用依赖了具体的人, 这就是第一层分派
     * 2. Person 类中委派方法又把子类自身的 this(状态) 传入这样就实现了第二次分派
     *
     * @param appraise
     */
    public abstract void access(IAppraise appraise);

}
