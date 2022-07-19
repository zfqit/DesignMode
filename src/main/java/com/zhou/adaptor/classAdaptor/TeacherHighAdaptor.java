package com.zhou.adaptor.classAdaptor;

/**
 * 适配者对象
 *
 * 因为 Java 中是单继承,所以使用继承被适配者对象时,会导致继承不了其他类
 * @author zhoufuqi
 * @date 2022/7/19
 */
public class TeacherHighAdaptor extends StudentType implements TeacherAdaptor {

    @Override
    public boolean studentStudy() {
        Integer type = super.getType(1);
        if (type.equals(1)) {
            return true;
        } else {
            return false;
        }
    }
}
