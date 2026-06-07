# Student Management System

A console-based Java application developed to practice Object-Oriented Programming (OOP), Collections Framework, CRUD operations, sorting, and exception handling.

## Features

* Add Student
* Find Student by ID
* Display All Students
* Sort Students by Name
* Update Student Details
* Delete Student
* Count Students
* Handle Invalid Input Using Exception Handling

## Technologies Used

* Java
* OOP Concepts
* HashMap
* ArrayList
* Comparable Interface
* Collections.sort()
* Exception Handling
* Scanner

## OOP Concepts Demonstrated

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Method Overriding

## Project Structure

```text
src/main/java
├── Person.java
├── Student.java
└── Main.java
```

## Design Highlights

* `Person` is an abstract class containing common attributes (`name`, `age`).
* `Student` extends `Person` and implements `Comparable<Student>`.
* Students are stored in a `HashMap<String, Student>` using Student ID as the key.
* Sorting is implemented using `Collections.sort()` and `compareTo()`.

## How to Run

Compile:

```bash
javac Person.java Student.java Main.java
```

Run:

```bash
java Main
```

## Menu Options

```text
1. Add Student
2. Find Student
3. Display All Students
4. Sort Students By Name
5. Update Student
6. Delete Student
7. Count Students
8. Exit
```

## Limitations

* Data is stored in memory only.
* Student records are lost when the application closes.
* Names with spaces are not supported (`Scanner.next()` is used).
* No database or file persistence.

## Future Enhancements

* JUnit Testing
* File Persistence
* JDBC Integration
* Input Validation Improvements

## Purpose

This project was created to strengthen understanding of Java fundamentals, OOP principles, collections, and CRUD operations through a practical menu-driven application.

## Screenshot

<img width="1858" height="803" alt="image" src="https://github.com/user-attachments/assets/1bfa870b-81e8-42a3-9563-9707f4cdb9f3" />

