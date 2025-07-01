## Student Management System - Spring Boot + MySQL

This is a simple Student Management System built with Spring Boot, MySQL, and RESTful API architecture. 
It allows basic CRUD operations and Exception-handling on student records.

## Project Structure

com.student.example
│
├── controller
│   └── StudentController.java
│
├── model
│   └── Student.java
│
├── service
│   └── StudentService.java
│
├── repository
│   └── StudentRepository.java
│
├── exception
│   └── StudentNotFoundException.java
│   └── StudentAlreadyExistException.java
│
└── StudentApplication.java

## Technologies Used

* Java 21

* Spring Boot 3.5.0

* Spring Data JPA

* MySQL Database

* Maven

* Lombok

* IntelliJ

## Setup Instructions

-> Prerequisites

* Java (JDK 17 or higher)

* Maven

* MySQL server running

## Database Configuration

* Update your application.properties (or application.yml) with MySQL credentials:

->properties
* spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
* spring.datasource.username=root
* spring.datasource.password=your_password
* spring.jpa.hibernate.ddl-auto=update
* spring.jpa.show-sql=true

## Run the Application

# Compile & run
mvn spring-boot:run

## API Endpoints
*  Base URL: http://localhost:8080/api/v1/

Method	 Endpoint	      Description

* GET	     /student/{id}	  Get student by ID
* GET	     /student	      Get all students
* POST	      /student	      Create a new student
* DELETE	 /student/{id}	  Delete a student by ID

## Sample JSON (for POST)
json
{
"id": 101,
"studentName": "John Doe",
"studentClass": 10,
"studentMarks": 89.5
}

## Features

* Create new students

* Retrieve student(s)

* Delete student by ID

* Exception handling for non-existent students (custom exception)

## Future Improvements

* Update student details (PUT endpoint)

* Validation using @Valid

* Swagger/OpenAPI documentation

* Unit tests with JUnit and Mockito

## Contributing
* Pull requests and suggestions are welcome! For major changes, open an issue first to discuss what you would like to change.

## License
This project is for educational purposes and has no license. Use freely.

