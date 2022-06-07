package com.zhou.designPrinciples.liskov.imporve;

/**
 * 里氏替换原则
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

        // 解决方案:
        // 通用的方案:抽出一个通用的基类, 把原有的继承关系去掉,采用依赖.聚合.组合关系代替
        B b = new B();
        // 优点
        // 1. 因为使用了依赖.聚合.组合方式使方法的调用更加明确了
        // 2. 使用依赖.聚合.组合方式,任然可以使用A类中的方法
        System.out.println(b.fun2(10, 2));
        System.out.println(b.fun3(10, 2));
    }
}

class Base {
}

class A extends Base {
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

class B {

    /**
     * 如果B类要使用A类,就要使用组合关系
     */
    private A a = new A();

    public Integer fun1(Integer a, Integer b) {
        return a + b;
    }

    public Integer fun2(Integer a, Integer b) {
        return fun1(a, b) + 9;
    }

    public Integer fun3(Integer a, Integer b) {
        return this.a.fun1(a, b) - 9;
    }
}

