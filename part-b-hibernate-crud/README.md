# Part B: Hibernate CRUD Operations with Student Entity

## Overview

This module demonstrates Hibernate ORM (Object-Relational Mapping) framework's CRUD (Create, Read, Update, Delete) operations using a Student entity stored in a MySQL database.

## Objectives

- Learn Hibernate ORM framework
- Understand entity mapping with annotations
- Implement CRUD operations (Create, Read, Update, Delete)
- Work with Session and SessionFactory
- Execute HQL (Hibernate Query Language) queries
- Connect to MySQL database

## Prerequisites

- Java 8 or higher
- Maven 3.6+
- MySQL 5.7+
- MySQL Client (for creating database)
- IDE: IntelliJ IDEA or Eclipse

## Key Components

### 1. Student.java (Entity Class)

- @Entity annotation marks class as Hibernate entity
- @Table specifies the database table name
- @Id marks primary key field
- @Column defines column properties

```java
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
}
```

### 2. StudentDAO.java (Data Access Object)

- Implements CRUD operations
- Uses Hibernate Session for database operations
- Methods: save(), findById(), update(), delete(), findAll()

### 3. HibernateUtil.java (Session Factory)

- Creates and manages SessionFactory
- Provides Session for database operations
- Handles Hibernate configuration

### 4. hibernate.cfg.xml (Configuration File)

- Configures Hibernate settings
- Database connection details
- Mapping files location
- Dialect and other properties

## Setup Instructions

### Step 1: Create MySQL Database

```bash
mysql -u root -p

CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(15),
    department VARCHAR(50)
);
```

### Step 2: Configure hibernate.cfg.xml

Update database connection properties:
- hibernate.connection.url: your MySQL URL
- hibernate.connection.username: your MySQL username
- hibernate.connection.password: your MySQL password

### Step 3: Build and Run

```bash
cd part-b-hibernate-crud
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## File Descriptions

### Student.java

Entity class representing a student in the database:
- id: Primary key (auto-generated)
- name: Student's name
- email: Student's email
- phone: Student's phone number
- department: Student's department

### StudentDAO.java

Data Access Object for student operations:
- `save(Student student)`: Insert new student
- `findById(int id)`: Retrieve student by ID
- `update(Student student)`: Update student information
- `delete(int id)`: Delete student by ID
- `findAll()`: Get all students
- `findByName(String name)`: Search students by name

### HibernateUtil.java

Utility class for Hibernate configuration:
- `getSessionFactory()`: Returns SessionFactory instance
- `closeSession()`: Closes Session properly

### Main.java

Demo application showing CRUD operations:
1. Create students
2. Read/retrieve students
3. Update student information
4. Delete students
5. List all students

## CRUD Operations Examples

### Create
```java
Student student = new Student();
student.setName("John Doe");
student.setEmail("john@example.com");
studentDAO.save(student);
```

### Read
```java
Student student = studentDAO.findById(1);
System.out.println(student.getName());
```

### Update
```java
Student student = studentDAO.findById(1);
student.setEmail("newemail@example.com");
studentDAO.update(student);
```

### Delete
```java
studentDAO.delete(1);
```

## Expected Database Schema

```
Table: students
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| id        | int          | NO   | PRI | NULL    | auto_increment |
| name      | varchar(100) | NO   |     | NULL    |                |
| email     | varchar(100) | YES  |     | NULL    |                |
| phone     | varchar(15)  | YES  |     | NULL    |                |
| department| varchar(50)  | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
```

## Key Concepts

### Session
- Represents connection to database
- Used for CRUD operations
- Must be closed after use

### SessionFactory
- Factory for creating Session objects
- Thread-safe and expensive to create
- Usually created once per application

### Entity
- Plain Java object mapped to database table
- Annotated with @Entity
- Each field maps to a column

### DAO Pattern
- Separates business logic from data access
- Provides clean interface for database operations
- Makes code more maintainable and testable

## Dependencies

- **hibernate-core-5.4.27.Final**: Core Hibernate ORM
- **mysql-connector-java-8.0.23**: MySQL database driver
- **javax.persistence-api-2.2**: JPA specification
- **slf4j-api-1.7.30**: Logging facade
- **logback-classic-1.2.3**: Logging implementation

## References

- [Hibernate Documentation](https://hibernate.org/)
- [JPA Specification](https://projects.eclipse.org/projects/ee4j.jpa)
- [Hibernate Tutorial](https://hibernate.org/orm/documentation/)

## Author

Created for learning Hibernate CRUD concepts.

## License

Open source - MIT License
