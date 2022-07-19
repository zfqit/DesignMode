package com.zhou.adaptor.objectAdaptor;

/**
 * 被适配对象
 *
 * @author zhoufuqi
 * @date 2022/7/19
 */
public class StudentType {

    /**
     * 例子: 把 Integer 类型的对应的学生类型适配成 boolean 类型来决定老师是否教的是小学生还是高中生
     * 1 等于 高中生,其他等于小学生
     * 获取学生类型
     */
    public Integer getType(Integer type) {
        return type;
    }
}
