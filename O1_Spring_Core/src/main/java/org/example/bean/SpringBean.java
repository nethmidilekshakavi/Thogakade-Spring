package org.example.bean;

import org.springframework.stereotype.Component;

@Component("bean") //bean ID eka naththnm defalut eka class name eka
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean Constructor");

    }


    public void sayHello(){
        System.out.println("Hello Sprimg Bean");
    }

}
