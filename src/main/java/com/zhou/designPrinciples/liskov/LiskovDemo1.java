package com.zhou.designPrinciples.liskov;

/**
 * 违反里氏替换原则
 *
 * @author zhoufuqi
 * @date 2022/6/7
 */
public class LiskovDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(11, 3));
        System.out.println(a.fun1(8, 3));
        System.out.println("----------------");

        // 没有使用里氏替换原则的缺点
        // 1. 方法之间描述不清楚.因为继承B类继承A类,b类中忘记了覆盖了A的计算差价的方法,导致方法和方法含义有歧义
        // 2. 随意覆盖父类的方法会导致整个继承关系的崩坏.
        // 因为B类覆盖了父类的方法,一旦后续有继承B类的子类的话,那子类中的方法就会变成父类覆盖后的方法,这样导致整个继承关系的崩坏
        // 解决方案:
        // 通用的方案:抽出一个通用的基类, 把原有的继承关系去掉,采用依赖.聚合.组合关系代替
        // 里氏替换原则解决方案: 不要重写父类的方法,新增自己的方法
        B b = new B();
        System.out.println(b.fun2(10, 2));
    }
}

class A {
    /**
     * 计算两数之间的差
     *
     * @param a
     * @param b
     * @return
     */
    public Integer fun1(Integer a, Integer b) {
        return a - b;
    }
}

class B extends A {

    public Integer fun1(Integer a, Integer b) {
        return a + b;
    }

    public Integer fun2(Integer a, Integer b) {
        return fun1(a, b) + 9;
    }
}

