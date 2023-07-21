package com.aleksandrphilimonov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.aleksandrphilimonov.spring.spring_introduction")
public class MyConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }
}
