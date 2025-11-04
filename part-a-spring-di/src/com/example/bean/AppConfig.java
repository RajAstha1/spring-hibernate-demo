package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Java-based Spring Configuration without XML
 * Demonstrates how to configure beans using @Configuration and @Bean annotations
 */
@Configuration
public class AppConfig {
    
    /**
     * Create a Bean instance using constructor injection
     * @return Bean instance with constructor-injected message
     */
    @Bean
    public Bean bean() {
        return new Bean("Message from AppConfig");
    }
    
    /**
     * Create an AnotherBean instance
     * @return AnotherBean instance
     */
    @Bean
    public AnotherBean anotherBean() {
        return new AnotherBean("Info from AppConfig");
    }
    
    /**
     * Create a Bean instance with setter injection of AnotherBean
     * @return Bean instance with AnotherBean injected
     */
    @Bean
    public Bean beanWithSetter() {
        Bean bean = new Bean("Bean with Setter Injection");
        bean.setAnotherBean(anotherBean());
        return bean;
    }
}
