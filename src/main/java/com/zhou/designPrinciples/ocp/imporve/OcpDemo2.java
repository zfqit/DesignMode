package com.zhou.designPrinciples.ocp.imporve;

/**
 * 开闭原则
 *
 * @author zhoufuqi
 * @date 2022/6/8
 */
public class OcpDemo2 {
    public static void main(String[] args) {
        // 客户端
        Coder coder = new Coder();
        coder.ChoiceCoder(new JavaCoder());
        coder.ChoiceCoder(new C艹Coder());
        coder.ChoiceCoder(new PHPCoder());
    }

}

/**
 * 提供方
 * 开闭原则: 对扩展开放, 对修改关闭
 * 添加一个抽象方法,让子类实现自己的功能,通过依赖的方式来实现不同功能
 * 也就让程序, 对提供方扩展开放, 对调用方关闭修改
 */
class Coder {
    public void ChoiceCoder(CoderBase c) {
        c.coder();
    }
}

abstract class CoderBase {
    public Integer type;

    public abstract void coder();
}

class JavaCoder extends CoderBase {
    public JavaCoder() {
        super.type = 1;
    }

    @Override
    public void coder() {
        System.out.println("Java 语言");
    }
}

class PHPCoder extends CoderBase {
    public PHPCoder() {
        super.type = 2;
    }

    @Override
    public void coder() {
        System.out.println("PHP 是世界上最好的语言");
    }
}

class C艹Coder extends CoderBase {
    public C艹Coder() {
        super.type = 3;
    }

    @Override
    public void coder() {
        System.out.println("C++ 语言");
    }
}
