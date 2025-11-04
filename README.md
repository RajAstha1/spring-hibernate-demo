# Spring and Hibernate Comprehensive Demo

A comprehensive repository demonstrating Spring and Hibernate concepts with three practical modules:

## Overview

This project includes three independent modules showcasing key enterprise Java concepts:

1. **Spring Dependency Injection (DI)** - Java-based configuration without XML
2. **Hibernate CRUD Operations** - Student entity management with MySQL database
3. **Spring + Hibernate Transaction Management** - Banking system with account transfers

## Project Structure

```
spring-hibernate-demo/
├── part-a-spring-di/                 # Spring DI with Java Configuration
│   ├── src/
│   │   └── com/example/
│   │       ├── bean/
│   │       │   ├── Bean.java             # Sample bean class
│   │       │   ├── AppConfig.java        # Java-based Spring configuration
│   │       │   └── Main.java             # Main class demonstrating DI
│   ├── pom.xml                        # Maven configuration
│   └── README.md                      # Part A setup instructions
├── part-b-hibernate-crud/            # Hibernate CRUD Application
│   ├── src/
│   │   └── com/example/
│   │       ├── entity/
│   │       │   └── Student.java          # Student entity
│   │       ├── dao/
│   │       │   └── StudentDAO.java       # CRUD operations
│   │       ├── util/
│   │       │   └── HibernateUtil.java    # Hibernate configuration
│   │       └── Main.java                 # Test CRUD operations
│   ├── resources/
│   │   └── hibernate.cfg.xml             # Hibernate configuration
│   ├── pom.xml                        # Maven configuration
│   └── README.md                      # Part B setup instructions
├── part-c-spring-hibernate-transactions/  # Spring + Hibernate Transactions
│   ├── src/
│   │   └── com/example/
│   │       ├── entity/
│   │       │   ├── Account.java          # Account entity
│   │       │   └── Transaction.java      # Transaction entity
│   │       ├── repository/
│   │       │   └── AccountRepository.java # Repository interface
│   │       ├── service/
│   │       │   └── AccountService.java   # Service with transaction management
│   │       ├── config/
│   │       │   ├── AppConfig.java        # Spring configuration
│   │       │   └── DataSourceConfig.java # Data source configuration
│   │       └── Main.java                 # Demo banking transactions
│   ├── resources/
│   │   ├── application.properties        # Application properties
│   │   └── database-schema.sql           # Database schema
│   ├── pom.xml                        # Maven configuration
│   └── README.md                      # Part C setup instructions
├── .gitignore                         # Git ignore rules (Java template)
└── README.md                          # This file
```

## Prerequisites

- Java 8 or higher
- Maven 3.6+
- MySQL 5.7+
- IDE: IntelliJ IDEA or Eclipse

## Getting Started

Each module is independent and can be run separately. Follow the setup instructions in each module's README.md:

- [Part A - Spring DI](./part-a-spring-di/README.md)
- [Part B - Hibernate CRUD](./part-b-hibernate-crud/README.md)
- [Part C - Spring + Hibernate Transactions](./part-c-spring-hibernate-transactions/README.md)

## Module Descriptions

### Part A: Spring Dependency Injection with Java Configuration

**Objective:** Create a Spring application demonstrating DI using Java-based configuration (no XML).

**Key Components:**
- `Bean.java` - Sample service bean
- `AppConfig.java` - Java-based Spring configuration using @Configuration
- `Main.java` - Demonstrates dependency injection with ApplicationContext

**Concepts Covered:**
- @Configuration and @Bean annotations
- Constructor and setter injection
- ApplicationContext usage
- Spring component scanning

### Part B: Hibernate CRUD Operations

**Objective:** Develop a Hibernate application for CRUD operations on a Student entity.

**Key Components:**
- `Student.java` - Entity class with JPA annotations
- `StudentDAO.java` - DAO class with CRUD methods
- `HibernateUtil.java` - Session factory initialization
- `Main.java` - Test application demonstrating CRUD operations

**Database:** MySQL
**Table:** students (id, name, email, phone, department)

**Concepts Covered:**
- JPA Entity mapping
- Hibernate annotations
- Session and SessionFactory
- CRUD operations (Create, Read, Update, Delete)
- HQL queries

### Part C: Spring + Hibernate Transaction Management

**Objective:** Create a banking system demonstrating transaction management and consistency.

**Key Components:**
- `Account.java` - Account entity
- `Transaction.java` - Transaction history entity
- `AccountRepository.java` - Spring Data JPA repository
- `AccountService.java` - Service with @Transactional methods
- `AppConfig.java` - Spring + Hibernate configuration

**Features:**
- Account transfers with fee deduction
- Automatic rollback on errors
- Transaction history logging
- Transfer validation

**Concepts Covered:**
- @Transactional annotation
- PlatformTransactionManager
- Transaction propagation
- Exception handling in transactions
- Spring Data JPA

## Building and Running

### Part A
```bash
cd part-a-spring-di
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Part B
```bash
cd part-b-hibernate-crud
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Part C
```bash
cd part-c-spring-hibernate-transactions
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## Dependencies

All modules use Maven for dependency management. Key dependencies:

- Spring Framework (Core, ORM)
- Hibernate ORM
- MySQL Connector/J
- JPA
- Log4j or SLF4J

## Documentation

Each module contains a detailed README.md with:
- Specific setup instructions
- Database configuration
- Running the application
- Expected output and test cases
- Additional resources and references

## Author

Created for learning Spring and Hibernate enterprise Java concepts.

## License

This project is open source and available under the MIT License.

## References

- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Hibernate ORM Documentation](https://hibernate.org/orm/)
- [Java Persistence API](https://projects.eclipse.org/projects/ee4j.jpa)
