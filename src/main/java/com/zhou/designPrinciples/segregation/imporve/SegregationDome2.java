package com.zhou.designPrinciples.segregation.imporve;

/**
 * 接口隔离原则,拆分方式
 *
 * @author zhoufuqi
 * @date 2022/6/7
 */
public class SegregationDome2 {
    public static void main(String[] args) {
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
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
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

    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }

    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}

/**
 * D 要 依赖 B类中的1, 4, 5 方法
 */
class D {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface3 interface3) {
        interface3.operation4();
    }

    public void depend5(Interface3 interface3) {
        interface3.operation5();
    }
}


class B implements Interface1, Interface2 {

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
}

class C implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("C = operation1");
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
