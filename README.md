# Object-Oriented Programming Exercises in Java

This repository contains a collection of Object-Oriented Programming (OOP) exercises implemented in Java, demonstrating fundamental OOP concepts such as encapsulation, inheritance, polymorphism, and abstraction.

## 📁 Repository Structure

```
Object-Oriented-Programming-main/
├── project/          # Main project: Subject Registration System
├── Q1/              # Exercise 1: Coffee Bag Price Calculator
├── Q2/              # Exercise 2: Book Management System
├── Q3/              # Exercise 3: Student Score Tracker
├── Q4/              # Exercise 4: Library Book Counter
├── Q5/              # Exercise 5: Student Grade Calculator
├── Q6/              # Exercise 6: Abstract Marks System
├── Q7/              # Exercise 7: Order Management with Inheritance
└── README.md        # This file
```

## 🎯 Learning Objectives

These exercises cover the following OOP concepts:
- **Encapsulation**: Private fields with public getter/setter methods
- **Inheritance**: Parent-child class relationships
- **Polymorphism**: Method overriding and abstract methods
- **Abstraction**: Abstract classes and interfaces
- **Static members**: Class-level variables and methods
- **Data validation**: Input validation and error handling

## 📚 Exercise Descriptions

### 🏗️ Main Project: Subject Registration System
**Location**: `project/`

A comprehensive academic subject registration system demonstrating advanced OOP concepts.

**Features**:
- **Core Classes**: `Subject` (parent), `Core`, `Elective` (child classes)
- **Management System**: `Register` class for CRUD operations
- **Menu-driven Interface**: Add, view, search, edit, and delete subjects
- **Inheritance**: Core and Elective subjects inherit from Subject base class
- **Polymorphism**: Different display behaviors for different subject types

**Key Files**:
- `Subject.java` - Abstract base class for subjects
- `Core.java` - Core subject implementation
- `Elective.java` - Elective subject implementation
- `Register.java` - Subject management system
- `Main (1).java` - Main application with user interface

### ☕ Q1: Coffee Bag Price Calculator
**Location**: `Q1/`

**Concept**: Basic encapsulation and method implementation

A simple application that calculates the total price of coffee bags including tax.

**Features**:
- Price calculation based on weight and number of bags
- Tax calculation functionality
- Encapsulated fields with private access modifiers

**Classes**:
- `CoffeeBag` - Encapsulates coffee bag properties and price calculations
- `MainCoffee` - Driver class demonstrating usage

### 📖 Q2: Book Management System
**Location**: `Q2/`

**Concept**: Encapsulation with getter/setter methods

A basic book management system with complete encapsulation.

**Features**:
- Private fields for book properties
- Complete getter and setter methods
- Data encapsulation best practices

**Classes**:
- `Book` - Book entity with encapsulated properties
- `MainBook` - Driver class for testing

### 📊 Q3: Student Score Tracker
**Location**: `Q3/`

**Concept**: Data validation and method implementation

A student scoring system with input validation and average calculation.

**Features**:
- Score validation (0-100 range)
- Dynamic score addition
- Average calculation
- String representation override

**Classes**:
- `Scores` - Student score management with validation
- `Main` - Driver class demonstrating functionality

### 📚 Q4: Library Book Counter
**Location**: `Q4/`

**Concept**: Static variables and methods

A library system that tracks the total number of books using static members.

**Features**:
- Static counter for total books
- Automatic book counting
- Library information display

**Classes**:
- `Book` - Book class with static counting functionality
- `Main` - Driver class showing static behavior

### 🎓 Q5: Student Grade Calculator
**Location**: `Q5/`

**Concept**: Arrays and method implementation

A student management system that calculates average grades from multiple courses.

**Features**:
- Array-based course marks storage
- Average calculation from multiple subjects
- Student information management

**Classes**:
- `Student` - Student entity with grade calculation
- `Main` - Driver class for testing

### 📈 Q6: Abstract Marks System
**Location**: `Q6/`

**Concept**: Abstract classes and method overriding

A grading system using abstract classes to define different percentage calculation methods.

**Features**:
- Abstract base class for marks calculation
- Different implementations for different student types
- Polymorphic percentage calculation

**Classes**:
- `Marks` - Abstract base class
- `A` - Student type A with 3 subjects
- `B` - Student type B with 4 subjects
- `Main` - Driver class demonstrating polymorphism

### 🛒 Q7: Order Management with Inheritance
**Location**: `Q7/`

**Concept**: Inheritance and method overriding

An order processing system demonstrating inheritance with shipping cost calculation.

**Features**:
- Base order functionality
- Shipping cost addition through inheritance
- Method overriding for specialized behavior
- Protected member access

**Classes**:
- `Order` - Base order class with basic functionality
- `ShippedOrder` - Extended class with shipping costs
- `UseOrder` - Driver class demonstrating inheritance

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line interface or Java IDE

### Running Individual Exercises

1. **Navigate to the exercise directory**:
   ```bash
   cd Q1  # Replace with desired exercise number
   ```

2. **Compile the Java files**:
   ```bash
   javac *.java
   ```

3. **Run the main class**:
   ```bash
   java MainCoffee  # Replace with appropriate main class name
   ```

### Running the Main Project

1. **Navigate to the project directory**:
   ```bash
   cd project
   ```

2. **Compile all files**:
   ```bash
   javac *.java
   ```

3. **Run the application**:
   ```bash
   java Main
   ```

## 🎓 Key Learning Outcomes

After completing these exercises, you will understand:

1. **Encapsulation**: How to protect data using private fields and provide controlled access through methods
2. **Inheritance**: How to create parent-child relationships between classes
3. **Polymorphism**: How different classes can provide different implementations of the same method
4. **Abstraction**: How to define contracts using abstract classes
5. **Static Members**: How to create class-level variables and methods
6. **Data Validation**: How to implement input validation and error handling
7. **Object Composition**: How to build complex systems using multiple interacting objects

## 👥 Contributors

**Group**: Triple
- **FADHEL ABDULLAH KHALED** (SW01082121)
- **Bakhatadah Turki Mohammed Mahfoudh** (SW01082045) 
- **Alaidaros Ali Abdulqader Abdullah** (SW01082033)

## 📝 Notes

- Each exercise builds upon previous concepts
- Code includes comments and documentation
- Follow Java naming conventions throughout
- All classes demonstrate proper OOP principles
- The main project integrates multiple OOP concepts in a real-world scenario

---

*This collection serves as a comprehensive introduction to Object-Oriented Programming concepts in Java, progressing from basic encapsulation to advanced inheritance and polymorphism.*
