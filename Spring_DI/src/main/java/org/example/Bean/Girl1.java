package org.example.Bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements Agreement{


    public Girl1() {

    }

    @Override
    public void chat() {
        System.out.println("Girl1 chat");
    }
}
