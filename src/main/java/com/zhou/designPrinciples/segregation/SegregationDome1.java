package com.zhou.designPrinciples.segregation;

/**
 * 违反接口隔离原则例子
 *
 * @author zhoufuqi
 * @date 2022/6/7
 */
public class SegregationDome1 {
    public static void main(String[] args) {
        // 这种接口依赖关系导致不同类型的类实现了接口中的所有方法
        // 但是有些类又不需要实现其他类中接口的方法,而且也必须实现
        // 这样就违反了接口隔离原则
        // 解决方法就是把接口拆分的更细,让每个类依赖接口的类实现最少的方法
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        D d = new D();
        d.depend1(new C());
        d.depend4(new C());
        d.depend5(new C());
    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

/**
 * A 要 依赖 B类中的1, 2, 3 方法
 */
class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

/**
 * D 要 依赖 B类中的1, 4, 5 方法
 */
class D {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}


class C implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("C = operation1");
    }

    @Override
    public void operation2() {
        System.out.println("C = operation2");
    }

    @Override
    public void operation3() {
        System.out.println("C = operation3");
    }

    @Override
    public void operation4() {
        System.out.println("C = operation4");
    }

    @Override
    public void operation5() {
        System.out.println("C = operation5");
    }
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B = operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B = operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B = operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B = operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B = operation5");
    }
}
