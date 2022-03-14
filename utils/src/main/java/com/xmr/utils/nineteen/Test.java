package com.xmr.utils.nineteen;


import org.springframework.stereotype.Repository;

import java.lang.annotation.Target;
import java.util.Arrays;
public class Test{
    public static void main(String[] args) {
        Day cole= Day.MONDAY;
        switch(cole){
            case MONDAY:
                System.out.println("周一");
                break;
            case TUESDAT:
                System.out.println("周二");
                break;
            default:
                System.out.println("default");
        }

    }
}
