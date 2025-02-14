package org.example.DI;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Aggrement{


    @Override
    public void chat() {
        System.out.println("Chat with Girl");
    }
}
