package org.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI{

    //Property Injection
    Aggrement girl;


    //Constructor Injection

    public void chatWithGirl(){

        girl.chat();

    }


  /*  @Autowired
    public Aggrement getGirl() {
        return girl;
    }

    public void setGirl(Aggrement girl) {
        this.girl = girl;
    }
*/

    @Autowired
    public Boy(Aggrement girl) {
        this.girl = girl;
    }



}
