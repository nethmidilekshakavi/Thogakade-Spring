package org.example;
import org.example.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"org.example.bean" , "org.example.Config"}) // meken tamai bean class okoma hadunganne
/*@ComponentScan(basePackageClasses = TestBean1.class) //ekin eka dennath puluwn
@ComponentScan(basePackageClasses = TestBean2.class) //ekin eka dennath puluwn
@ComponentScan(basePackageClasses = TestBean3.class) //ekin eka dennath puluwn*/
public class AppConfig {

    //Ape projecte eke class ekk nowana vita mehema call kranne
    @Bean
    //by defalut Id eka vididyt ganne getConnetion kiyana method name eka
    @Scope("prototype")
    public MyConnection getConnection(){
        return new MyConnection();
    }



}
