package com.xmr.utils.ten;

public class Cat implements Animal {
    String name;
    public Cat(String name) {
        this.name=name;
    }

    @Override
    public void say() {
        System.out.println("Cat实现了Animal接口");
    }
}
