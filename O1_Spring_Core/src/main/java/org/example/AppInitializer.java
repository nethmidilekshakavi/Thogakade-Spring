package org.example;

import org.example.bean.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();
/*

        Object springBean  = context.getBean("bean");
        System.out.println(springBean + ".......Hello Spring.......");

        System.out.println(springBean);

        //first Letter eka simple wenna one
        Object testBean1 = context.getBean("testBean1");
        System.out.println(testBean1);

                                                            //bean ID eka
        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2");
        System.out.println(testBean2);
*/


       /* //JVM shutdown wala welawwe shutdown wena wenawl clocse wenna kiyl kiynne meken
        Runtime.getRuntime().addShutdownHook(new Thread(){

            public void run(){
                System.out.println("Shutting down");
                context.close();
            }


        });*/



     /*   TestBean3 testBean3 = context.getBean(TestBean3.class,"testBean3");
        System.out.println(testBean3);
*/
                                                //Bean ID eka method name eka
        Object myConnection = context.getBean("getConnection");
        System.out.println(myConnection);

/*
 ------------------------------------------------------------------------------------------------------------
*/

        //Singleton use wenwa ekama obj eka ref samanai

        TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);


        TestBean1 ref12 = context.getBean(TestBean1.class);
        System.out.println(ref12);

        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        MyConnection ref4 = context.getBean(MyConnection.class);
        System.out.println(ref4);

        MyConnection ref5 = context.getBean(MyConnection.class);
        System.out.println(ref5);

        /*
 ------------------------------------------------------------------------------------------------------------
*/

        //kelinma call kranna puluwan mekken
        context.registerShutdownHook();

    }

}
