package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.bean.Bean;
import com.example.bean.AppConfig;

/**
 * Main class to demonstrate Spring Dependency Injection
 * Using Java-based configuration without XML
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Spring Dependency Injection Demo ===");
        System.out.println();
        
        // Create ApplicationContext using Java configuration
        // This will scan the AppConfig class for @Configuration and @Bean annotations
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
        
        System.out.println("1. Getting Bean from Context (Constructor Injection):");
        Bean bean = context.getBean(Bean.class);
        bean.displayMessage();
        System.out.println();
        
        System.out.println("2. Getting Bean with Setter Injection:");
        Bean beanWithSetter = context.getBean("beanWithSetter", Bean.class);
        beanWithSetter.displayMessage();
        beanWithSetter.callAnotherBean();
        System.out.println();
        
        System.out.println("3. Getting AnotherBean directly:");
        com.example.bean.AnotherBean anotherBean = context.getBean(com.example.bean.AnotherBean.class);
        anotherBean.printInfo();
        System.out.println();
        
        System.out.println("=== Dependency Injection Demo Complete ===");
        
        // Close the ApplicationContext
        context.close();
    }
}
