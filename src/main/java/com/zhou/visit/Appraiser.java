package com.zhou.visit;

import java.util.LinkedList;
import java.util.List;

/**
 * 计评员
 * 也就是管理具体人员
 *
 * @author zhoufuqi
 * @date 2022/9/21
 */
public class Appraiser {

    private List<Person> persons = new LinkedList<>();

    public void attach(Person p) {
        persons.add(p);
    }

    public void detach(Person p) {
        persons.remove(p);
    }

    public void display(IAppraise appraise) {
        for (Person person : persons) {
            person.access(appraise);
        }
    }
}
