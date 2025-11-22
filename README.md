# Student Management System – Java (OOP, Inheritance, Interfaces)

## 📌 Overview

This project is a **console-based Student Management System** developed in Java, demonstrating complete Object-Oriented Programming concepts, including:

* Inheritance
* Interfaces
* Abstract classes
* Method overloading
* Method overriding
* Polymorphism
* CRUD operations using `HashMap`

This system allows the user to add, delete, update, search, and display student records, all through a menu-driven interface.

---

## 🧠 Concepts Demonstrated

### ✔ Inheritance

`Student` class inherits from the abstract class `Person`.

### ✔ Interfaces

`RecordActions` interface defines CRUD operations, implemented by `StudentManager`.

### ✔ Abstract Class

`Person` contains common fields like `name` and `email` and an abstract method `displayInfo()`.

### ✔ Polymorphism

* **Method Overriding:** `displayInfo()` overridden in `Student`
* **Method Overloading:** `displayInfo(boolean showGrade)` in `Student`

### ✔ Data Structures Used

* `HashMap<Integer, Student>` to store and manage student records efficiently.

---

## 📂 Project Structure

```
Student Management System
│
├── Person.java
├── Student.java
├── RecordActions.java
├── StudentManager.java
└── Main.java
```

All files can be kept in the same folder (no packages required).

---

## 🖥️ Features

* Add new student records
* Prevent duplicate roll numbers
* Update existing student details
* Delete student data
* Search student by roll number
* Display all stored students
* Auto grade calculation based on marks

---

## 🧮 Grade Criteria

| Marks | Grade |
| ----- | ----- |
| 85+   | A     |
| 70+   | B     |
| 50+   | C     |
| <50   | D     |

---

## ▶️ How to Run

### 1️⃣ Compile all files

```
javac *.java
```

### 2️⃣ Run the main program

```
java Main
```

---

## 📸 Sample Output

```
===== Student Management Menu =====
1. Add Student
2. Delete Student
3. Update Student
4. Search Student
5. View All Students
6. Exit
Enter choice: 1
Enter Roll No: 101
Enter Name: Ankit
Enter Email: ankit@gmail.com
Enter Course: B.Tech
Enter Marks: 88
Student Added Successfully!
```

---

## 🎯 Learning Outcomes

After completing this project, you will:

* Understand abstract classes and interfaces
* Apply inheritance and polymorphism
* Implement a structured multi-class Java project
* Use data structures for efficient record management
* Work with real-world CRUD logic

---

## 📜 License

This project is free for academic and personal use.

Java Lab Assignment – Student Management System

