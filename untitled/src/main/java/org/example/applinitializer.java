package org.example;

import org.example.bean.TestBean01;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class applinitializer {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext contect = new AnnotationConfigApplicationContext();

        contect.register(AppConfig.class);
        contect.refresh();


        TestBean01 testBean01 = new TestBean01();

        System.out.println(testBean01 + "Hello Spring");




        contect.registerShutdownHook();

    }

}