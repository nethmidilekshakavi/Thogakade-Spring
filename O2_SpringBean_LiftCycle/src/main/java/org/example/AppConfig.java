package org.example;

import org.example.Bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //beans tike watenna one kiyl kiynne meken
@ComponentScan(basePackages = {"org.example.Bean"})
public class AppConfig {

    @Bean
   public MyConnection MyConnection(){
      return new MyConnection();
   }
}
