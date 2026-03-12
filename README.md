# Student Management System (JDBC CRUD Application)

## 📌 Overview

This project is a **Console-Based Student Management System** built using **Java and JDBC**.
It demonstrates how to implement **CRUD operations (Create, Read, Update, Delete)** while following a **layered architecture used in enterprise Java applications**.

The main objective of this project was to understand how different layers of an application interact with each other while maintaining **clean code, loose coupling, and separation of concerns**.

---

## 🚀 Features

* Add a new student
* Search for a student by ID
* Update student details
* Delete a student record
* Console-based interactive menu

---

## 🏗 Architecture

The project follows a **Layered Architecture**:

```
Controller → Service → DAO → Database
```

### Layers

**Controller Layer**

* Handles user input from the console.
* Calls service layer methods.

**Service Layer**

* Contains business logic.
* Acts as a bridge between controller and DAO.

**DAO Layer**

* Handles all database operations using JDBC.

**DTO Layer**

* Transfers student data between layers.

**Factory Classes**

* Used to create objects of service and DAO implementations.
* Helps maintain loose coupling.

**Utility Class**

* Manages database connection.

---

## 📂 Project Structure

```
src
│
├── controller
│   └── TestApp.java
│
├── dto
│   └── Student.java
│
├── service
│   ├── RStudentService.java
│   └── StudentServiceImpl.java
│
├── servicefactory
│   └── StudentServiceFactory.java
│
├── persistance
│   ├── RStudentDao.java
│   └── StudentDaoImpl.java
│
├── daofactory
│   └── StudentDaoFactory.java
│
└── util
    └── DBConnection.java
```

---

## 🛠 Technologies Used

* Java
* JDBC
* MySQL
* MySQL Connector/J
* Object-Oriented Programming
* Factory Design Pattern
* DAO Pattern

---

## 🗄 Database Setup

Create the database and table using the following SQL:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE student(
    sid INT PRIMARY KEY AUTO_INCREMENT,
    sname VARCHAR(50),
    sage INT,
    saddress VARCHAR(100)
);
```

---

## ▶️ How to Run the Project

1. Clone the repository

```
git clone https://github.com/yourusername/student-management-system.git
```

2. Import the project into your IDE (Eclipse / IntelliJ)

3. Add **MySQL Connector/J** to the project build path.

4. Update database credentials in `DBConnection.java`

```
private static final String DBURL = "jdbc:mysql://localhost:3306/studentdb";
private static final String DBUSERNAME = "root";
private static final String DBPASSWORD = "yourpassword";
```

5. Run

```
TestApp.java
```

---

## 💻 Example Console Menu

```
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. Search Student
3. Update Student
4. Delete Student
5. Exit
```

---

## 📚 Concepts Practiced

* JDBC Database Connectivity
* Layered Architecture
* DAO Design Pattern
* Factory Design Pattern
* Singleton Pattern
* Loose Coupling with Interfaces
* Separation of Concerns

---

## 📈 Future Improvements

* Add "View All Students" feature
* Implement logging
* Add input validation
* Convert the project into a **Spring Boot REST API**

---

## 👨‍💻 Author

Daksh Saini
BCA Student | Aspiring Java Backend Developer
