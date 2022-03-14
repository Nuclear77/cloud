package com.xmr.utils.fourteen;

public class Dog {
    static public void say(String name){
        System.out.println(name);
    }
    static{
        String name="Dog";
        System.out.println("Dog的静态块");
    }
}
