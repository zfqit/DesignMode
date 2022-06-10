package com.zhou.designPrinciples.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 违反迪米特法则
 *
 * @author zhoufuqi
 * @date 2022/6/8
 */
public class DemeterDemo1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


//学院员工管理 类
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        CollegeEmployee collegeEmployee;
        for (int i = 0; i < 10; i++) {
            collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id=" + i);
            list.add(collegeEmployee);
        }
        return list;
    }
}

//总部员工管理类
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        Employee employee;
        for (int i = 0; i < 5; i++) {
            employee = new Employee();
            employee.setId("总部员工id=" + i);
            list.add(employee);
        }
        return list;
    }

    /**
     * 迪米特法则还有个更简单的定义：只与直接的朋友通信
     * 成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友
     * 而 CollegeEmployee 类不是 SchoolManager 的直接朋友,所以违反迪米特法则
     * @param sub
     */
    public void printAllEmployee(CollegeManager sub) {
        System.out.println("--------------学院员工--------------");
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println(collegeEmployee.getId());
        }
        System.out.println("---------------总部员工-------------");
        List<Employee> list2 = this.getAllEmployee();
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }
}
