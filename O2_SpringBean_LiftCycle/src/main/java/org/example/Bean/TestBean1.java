package org.example.Bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component*/
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //singleton apply
public class TestBean1 {

    public TestBean1() {

        System.out.println("TestBean");

    }
}
