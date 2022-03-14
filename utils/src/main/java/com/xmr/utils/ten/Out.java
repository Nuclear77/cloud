package com.xmr.utils.ten;

public class Out {
     String OUT_NAME="外围类";



    /*非静态内部类*/
    class In{
        String name=OUT_NAME;
    }


    /*静态内部类，嵌套类*/
    static class One {
        static void say(){
            System.out.println("nihao");
        }
        String name;
    }

    /*局部内部类，方法内部*/
    public void two(){
        class two extends Cat{
            String name =OUT_NAME;
            public two(String name) {
                super(name);
            }
        }
    }

    /*第二种局部内部类，任意作用域*/
    public void say(){
        if("as".equals("as")){
            class b{}
        }
    }

    /*匿名内部类,继承自其他类*/
    public Cat good(final String hello){
        return new Cat("cat"){
            public String age=hello;
            private String hoje=hello;
        };
    }
    /*匿名内部类,实现接口*/
    public void o(){
        Animal animal=new Animal() {
            @Override
            public void say() {
                System.out.println("匿名内部类实现Animal接口");
            }
        };
    }
    public static void main(String[] args) {
        Out out=new Out();
        One.say();





    }


}
