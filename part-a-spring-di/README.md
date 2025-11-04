# Part A: Spring Dependency Injection with Java Configuration

## Overview

This module demonstrates Spring Framework's Dependency Injection (DI) using Java-based configuration instead of XML configuration files. This is the modern approach to configuring Spring beans.

## Objectives

- Learn Spring Dependency Injection concepts
- Understand @Configuration and @Bean annotations
- Implement constructor and setter injection
- Use ApplicationContext to retrieve beans
- Eliminate XML configuration files

## Prerequisites

- Java 8 or higher
- Maven 3.6+
- Spring Framework 5.3+
- IDE: IntelliJ IDEA or Eclipse

## Project Structure

```
part-a-spring-di/
├── src/
│   └── com/example/
│       ├── bean/
│       │   ├── Bean.java              # Sample bean class
│       │   ├── AnotherBean.java       # Another bean class
│       │   └── AppConfig.java         # Java-based Spring configuration
│       └── Main.java                  # Main class demonstrating DI
├── target/
│   ├── classes/
│   └── spring-di-demo-1.0.0.jar
└── pom.xml                            # Maven configuration
```

## Key Concepts

### 1. @Configuration Annotation

Marks a class as a source of bean definitions:

```java
@Configuration
public class AppConfig {
    // Bean definitions
}
```

### 2. @Bean Annotation

Defines bean creation methods:

```java
@Bean
public Bean bean() {
    return new Bean("Constructor injected message");
}
```

### 3. Constructor Injection

Injecting dependencies through constructor:

```java
@Bean
public Bean bean() {
    return new Bean("Message from config");
}
```

### 4. Setter Injection

Injecting dependencies through setter methods:

```java
@Bean
public Bean beanWithSetter() {
    Bean bean = new Bean("Bean with setter injection");
    bean.setAnotherBean(anotherBean());
    return bean;
}
```

### 5. ApplicationContext

Main interface for accessing beans:

```java
ApplicationContext context = 
    new AnnotationConfigApplicationContext(AppConfig.class);
Bean bean = context.getBean(Bean.class);
```

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/RajAstha1/spring-hibernate-demo.git
cd spring-hibernate-demo/part-a-spring-di
```

### 2. Build the Project

```bash
mvn clean install
```

This will:
- Download all dependencies (including Spring Framework)
- Compile the source code
- Run any unit tests
- Package the project into a JAR file

### 3. Run the Application

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

Or directly:

```bash
java -cp target/classes:target/dependency/* com.example.Main
```

## Expected Output

When you run the Main class, you should see:

```
=== Spring Dependency Injection Demo ===

1. Getting Bean from Context (Constructor Injection):
Bean Message: Message from AppConfig

2. Getting Bean with Setter Injection:
Bean Message: Bean with Setter Injection
AnotherBean Info: Info from AppConfig

3. Getting AnotherBean directly:
AnotherBean Info: Info from AppConfig

=== Dependency Injection Demo Complete ===
```

## File Descriptions

### Bean.java

A simple POJO (Plain Old Java Object) demonstrating:
- Constructor injection
- Setter injection
- Dependency composition

### AnotherBean.java

Another simple POJO demonstrating:
- Constructor injection
- Basic method invocation

### AppConfig.java

Spring Java configuration class showing:
- @Configuration annotation
- @Bean methods for object creation
- Multiple ways to configure beans
- Inter-bean dependencies

### Main.java

Demonstration class showing:
- AnnotationConfigApplicationContext creation
- Bean retrieval from context
- Method invocation on beans
- Proper resource cleanup

## Common Issues & Solutions

### Issue 1: ClassNotFoundException

**Problem:** `Exception in thread "main" java.lang.ClassNotFoundException: org.springframework.context.annotation.AnnotationConfigApplicationContext`

**Solution:** Ensure Spring framework JARs are in the classpath. Run with Maven:

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Issue 2: NoSuchBeanDefinitionException

**Problem:** `No qualifying bean of type 'com.example.bean.Bean' is defined`

**Solution:** Ensure @Bean methods exist in AppConfig and are properly annotated.

## Extension Ideas

1. **Add Property Injection:** Create a configuration file for bean properties
2. **Add AOP:** Implement aspect-oriented programming for logging
3. **Add Profiles:** Create development and production configurations
4. **Add Custom Annotations:** Create custom bean creation annotations
5. **Add Testing:** Write unit tests using Spring's testing framework

## Dependencies

- **spring-core-5.3.0:** Core Spring Framework
- **spring-context-5.3.0:** Spring Context for bean management
- **slf4j-api-1.7.30:** Simple Logging Facade
- **logback-classic-1.2.3:** Logging implementation

## References

- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Bean Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)
- [Java Configuration Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java)
- [Dependency Injection](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-setter-injection)

## Author

Created for learning Spring Framework concepts.

## License

Open source - MIT License
