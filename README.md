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
├── servicefact
```
