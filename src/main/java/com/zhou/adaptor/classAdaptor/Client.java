package com.zhou.adaptor.classAdaptor;

/**
 * @author zhoufuqi
 * @date 2022/7/19
 */
public class Client {
    public static void main(String[] args) {
        new Teacher().studyStudent(new TeacherHighAdaptor());
        // 如果要新增小学生或其他类型的转换,只需要实现适配器接口,并实现转换方法,即可
    }
}
