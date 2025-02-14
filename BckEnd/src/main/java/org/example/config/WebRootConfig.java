package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.example.controller"})
public class WebRootConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/customer/**")
                .allowedOrigins("*") //meken apu req vithri resource denne / "*" ona thanakin ena ekk ganna kiyl kiyanwa
                .allowCredentials(true)
                .allowedMethods("GET","POST","PUT","DELETE","OPTION")
                .allowedHeaders("*");
    }
}
