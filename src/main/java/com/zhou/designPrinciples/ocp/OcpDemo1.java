package com.zhou.designPrinciples.ocp;

/**
 * 违反开闭原则
 *
 * @author zhoufuqi
 * @date 2022/6/8
 */
public class OcpDemo1 {
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
 * 违反开闭原则:
 * 1. 新增功能需要修改原本代码, 如新增一个其他语言的功能
 * 2. 扩展不开放
 */
class Coder {

    public void ChoiceCoder(CoderBase c) {
        if (c.type == 1) {
            printJavaCoder();
        } else if (c.type == 2) {
            printPhPCoder();
        } else if (c.type == 3) {
            printCCoder();
        }
    }

    private void printJavaCoder() {
        System.out.println("Java 语言");
    }

    private void printCCoder() {
        System.out.println("C++ 语言");
    }

    private void printPhPCoder() {
        System.out.println("PHP 是世界上最好的语言");
    }
}

class CoderBase {
    public Integer type;
}

class JavaCoder extends CoderBase {
    public JavaCoder() {
        super.type = 1;
    }
}

class PHPCoder extends CoderBase {
    public PHPCoder() {
        super.type = 2;
    }
}

class C艹Coder extends CoderBase {
    public C艹Coder() {
        super.type = 3;
    }
}
