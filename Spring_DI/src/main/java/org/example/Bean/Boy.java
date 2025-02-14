package org.example.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {


    @Qualifier("girl2")
    @Autowired
    Agreement girl ;

    public Boy() {
        System.out.println("Boy Constructor");
    }


    public void chatWithGirl(){


        girl.chat();

    }

}
