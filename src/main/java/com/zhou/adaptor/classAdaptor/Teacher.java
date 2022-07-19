package com.zhou.adaptor.classAdaptor;

/**
 * @author zhoufuqi
 * @date 2022/7/19
 */
public class Teacher {
    public void studyStudent(TeacherAdaptor teacherAdaptor) {
        System.out.println("老师准备教那种类型的学生学习");
        if (teacherAdaptor.studentStudy()) {
            System.out.println("教高中生学习,态度很严厉");
        } else {
            System.out.println("教小学生学习,态度很温和");
        }
    }

}
