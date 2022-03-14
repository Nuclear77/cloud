package com.xmr.utils.fourteen;

public class Cat {
    @Override
    public boolean equals(Object obj) {
        Cat cat=(Cat)obj;
        if(cat.name.equals(name))
            return true;

        return false;
    }
    public String name;
    public void say(){
        System.out.println("nihao");
    }
}
