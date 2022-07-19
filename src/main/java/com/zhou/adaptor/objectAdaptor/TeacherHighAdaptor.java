package com.zhou.adaptor.objectAdaptor;

/**
 * 适配者对象
 *
 * @author zhoufuqi
 * @date 2022/7/19
 */
public class TeacherHighAdaptor implements TeacherAdaptor {

    /**
     * 通过聚合的方式来实现适配
     */
    private StudentType studentType;

    public TeacherHighAdaptor(StudentType studentType) {
        this.studentType = studentType;
    }

    @Override
    public boolean studentStudy() {
        Integer type = this.studentType.getType(1);
        if (type.equals(1)) {
            return true;
        } else {
            return false;
        }
    }
}
