package com.zhou.uml.composition;

class Mouse {
}

class Monitor {
}

public class Computer {
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();
}