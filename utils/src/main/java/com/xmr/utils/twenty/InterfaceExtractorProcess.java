package com.xmr.utils.twenty;


import org.junit.Test;
import org.junit.Assert;

public class InterfaceExtractorProcess  {
    Cat cat=new Cat();

    private Cat methodOne(String name){
        if(cat !=null){
            cat.name=name;
            return cat;

        }
        Cat cat=new Cat();
        cat.name=name;
        return cat;
    }
    public int methodTwo(){
        System.out.println("这是methodTwo");
        return 2;
    }
    @Test
    public void methodOneTest(){
        Assert.assertEquals(methodOne("闲闲"),cat);
    }



}
