# ☕ Java Basics – Complete Beginner Guide

Java is a **high-level, object-oriented, platform-independent programming language** used for Web, Mobile (Android), Desktop, and Enterprise applications.

---

# 📌 Table of Contents

1. What is Java?
2. Java Architecture
3. Program Structure
4. Data Types
5. Variables
6. Operators
7. Conditional Statements
8. Loops
9. Arrays
10. Methods
11. Object-Oriented Basics
12. Strings
13. Exception Handling
14. Input in Java

---

# 1️⃣ What is Java?

- Developed in **1995**
- Platform Independent (WORA – Write Once Run Anywhere)
- Object-Oriented
- Secure and Robust
- Used in Web, Android, Enterprise applications

---

# 2️⃣ Java Architecture

```
Java Code (.java)
      ↓
Compiler (javac)
      ↓
Bytecode (.class)
      ↓
JVM
      ↓
Output
```

- **JDK** → Development tools
- **JRE** → Runtime environment
- **JVM** → Executes bytecode

---

# 3️⃣ Basic Java Program Structure

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explanation:
- `class` → Blueprint
- `main()` → Entry point
- `System.out.println()` → Prints output

---

# 4️⃣ Data Types

## 🔹 Primitive Data Types

| Type    | Example |
|---------|----------|
| byte    | byte a = 10; |
| short   | short s = 100; |
| int     | int x = 10; |
| long    | long l = 1000L; |
| float   | float f = 10.5f; |
| double  | double d = 20.5; |
| char    | char c = 'A'; |
| boolean | boolean b = true; |

---

## 🔹 Non-Primitive Data Types

- String
- Arrays
- Classes
- Interfaces

```java
String name = "Java";
```

---

# 5️⃣ Variables

```java
int age = 21;        // Local variable
String name = "Mouna";
```

### Types:
- Local Variable
- Instance Variable
- Static Variable

---

# 6️⃣ Operators

## Arithmetic
```java
+  -  *  /  %
```

## Relational
```java
==  !=  >  <  >=  <=
```

## Logical
```java
&&  ||  !
```

## Assignment
```java
=  +=  -=  *=  /=
```

---

# 7️⃣ Conditional Statements

## if-else

```java
int age = 18;

if(age >= 18){
    System.out.println("Adult");
}else{
    System.out.println("Minor");
}
```

## switch

```java
int day = 1;

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    default:
        System.out.println("Invalid");
}
```

---

# 8️⃣ Loops

## for loop

```java
for(int i=0; i<5; i++){
    System.out.println(i);
}
```

## while loop

```java
int i = 0;

while(i < 5){
    System.out.println(i);
    i++;
}
```

## do-while

```java
int i = 0;

do{
    System.out.println(i);
    i++;
}while(i < 5);
```

---

# 9️⃣ Arrays

## 1D Array

```java
int[] arr = {1,2,3,4,5};
System.out.println(arr[0]);
```

## 2D Array

```java
int[][] matrix = {
    {1,2},
    {3,4}
};
```

---

# 🔟 Methods

```java
public static int add(int a, int b){
    return a + b;
}
```

### Calling Method

```java
int result = add(5,3);
System.out.println(result);
```

---

# 1️⃣1️⃣ Object-Oriented Basics

## Class & Object

```java
class Student {
    String name;
    int age;

    void display(){
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mouna";
        s1.age = 21;
        s1.display();
    }
}
```

### OOP Concepts
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

---

# 1️⃣2️⃣ Strings

```java
String name = "Java";

System.out.println(name.length());
System.out.println(name.toUpperCase());
System.out.println(name.charAt(0));
```

---

# 1️⃣3️⃣ Exception Handling

```java
try{
    int a = 10/0;
}catch(Exception e){
    System.out.println("Error occurred");
}
```

---

# 1️⃣4️⃣ Taking Input in Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
    }
}
```

---

# ✅ Summary

✔ Java is Object-Oriented  
✔ Platform Independent  
✔ Strongly Typed  
✔ Widely Used in Industry  

---

# 🚀 Next Steps

- Learn OOP deeply
- Learn Collections Framework
- Practice on LeetCode
- Build Mini Projects

---

**Happy Coding ☕**

# ☕ Java Intermediate – Complete Guide

This guide covers **intermediate-level Java concepts** required for backend development, interviews, and real-world projects.

---

# 📌 Table of Contents

1. Object-Oriented Programming (OOP)
2. Constructors
3. this & super Keywords
4. Inheritance
5. Polymorphism
6. Abstraction
7. Interfaces
8. Packages
9. Access Modifiers
10. Static Keyword
11. Final Keyword
12. Exception Handling (Advanced)
13. Collections Framework
14. Generics
15. Wrapper Classes
16. StringBuilder & StringBuffer
17. Enums
18. File Handling
19. Multithreading Basics
20. Java 8 Features (Intro)

---

# 1️⃣ Object-Oriented Programming (OOP)

Java follows 4 main OOP principles:

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

---

# 2️⃣ Constructors

Used to initialize objects.

```java
class Student {
    String name;

    Student(String name){
        this.name = name;
    }
}
```

### Types:
- Default Constructor
- Parameterized Constructor
- Copy Constructor

---

# 3️⃣ this & super Keywords

## this
Refers to current object.

```java
class Student {
    String name;

    Student(String name){
        this.name = name;
    }
}
```

## super
Refers to parent class object.

```java
class Parent {
    Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child(){
        super();
        System.out.println("Child Constructor");
    }
}
```

---

# 4️⃣ Inheritance

Allows one class to acquire properties of another.

```java
class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Bark");
    }
}
```

### Types:
- Single
- Multilevel
- Hierarchical

---

# 5️⃣ Polymorphism

## Method Overloading (Compile-time)

```java
class MathUtil {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}
```

## Method Overriding (Runtime)

```java
class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
```

---

# 6️⃣ Abstraction

Achieved using abstract classes or interfaces.

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw(){
        System.out.println("Drawing Circle");
    }
}
```

---

# 7️⃣ Interfaces

Used for full abstraction.

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start(){
        System.out.println("Car starts");
    }
}
```

---

# 8️⃣ Packages

Used to group related classes.

```java
package mypackage;

public class MyClass {
}
```

Importing:
```java
import mypackage.MyClass;
```

---

# 9️⃣ Access Modifiers

| Modifier   | Same Class | Same Package | Subclass | Other Package |
|------------|------------|--------------|----------|---------------|
| public     | ✅ | ✅ | ✅ | ✅ |
| protected  | ✅ | ✅ | ✅ | ❌ |
| default    | ✅ | ✅ | ❌ | ❌ |
| private    | ✅ | ❌ | ❌ | ❌ |

---

# 🔟 Static Keyword

Belongs to class rather than object.

```java
class Counter {
    static int count = 0;

    Counter(){
        count++;
    }
}
```

---

# 1️⃣1️⃣ Final Keyword

- final variable → constant
- final method → cannot override
- final class → cannot inherit

```java
final class A {
}
```

---

# 1️⃣2️⃣ Advanced Exception Handling

```java
try{
    int arr[] = new int[2];
    System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid index");
}
finally{
    System.out.println("Always executes");
}
```

### Keywords:
- try
- catch
- finally
- throw
- throws

---

# 1️⃣3️⃣ Collections Framework

Common Interfaces:
- List
- Set
- Map
- Queue

Example:

```java
import java.util.*;

List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
```

Common Classes:
- ArrayList
- LinkedList
- HashSet
- HashMap
- PriorityQueue

---

# 1️⃣4️⃣ Generics

Allows type safety.

```java
List<String> names = new ArrayList<>();
names.add("Mouna");
```

---

# 1️⃣5️⃣ Wrapper Classes

Primitive → Object

| Primitive | Wrapper |
|-----------|----------|
| int       | Integer |
| double    | Double |
| char      | Character |

Example:
```java
Integer num = 10;
```

---

# 1️⃣6️⃣ StringBuilder & StringBuffer

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```

- String → Immutable
- StringBuilder → Mutable (Not Thread-safe)
- StringBuffer → Mutable (Thread-safe)

---

# 1️⃣7️⃣ Enums

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
```

---

# 1️⃣8️⃣ File Handling

```java
import java.io.File;
import java.io.FileWriter;

File file = new File("test.txt");
FileWriter writer = new FileWriter(file);
writer.write("Hello");
writer.close();
```

---

# 1️⃣9️⃣ Multithreading Basics

```java
class MyThread extends Thread {
    public void run(){
        System.out.println("Thread running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

---

# 2️⃣0️⃣ Java 8 Features (Intro)

- Lambda Expressions
- Functional Interfaces
- Streams API
- Method References

Example:

```java
List<String> list = Arrays.asList("A", "B", "C");
list.forEach(item -> System.out.println(item));
```

---

# ✅ Summary

✔ Strong OOP knowledge  
✔ Collections mastery  
✔ Exception handling  
✔ Multithreading basics  
✔ Java 8 functional programming  

---

# 🚀 Next Steps

- Deep dive into Multithreading
- Learn Spring Boot
- Practice DSA in Java
- Build REST APIs

---

**Happy Coding ☕**

# ☕ Java Advanced – Complete Guide

This guide covers **advanced Java concepts** required for backend development, enterprise applications, system design, and technical interviews.

---

# 📌 Table of Contents

1. JVM Deep Dive
2. Memory Management & Garbage Collection
3. Multithreading & Concurrency
4. Synchronization & Locks
5. Executor Framework
6. Callable, Future & CompletableFuture
7. Java Streams API (Advanced)
8. Functional Interfaces
9. Reflection API
10. Annotations
11. Serialization & Deserialization
12. Java NIO
13. Design Patterns in Java
14. SOLID Principles
15. JDBC
16. Networking in Java
17. Java Modules (JPMS)
18. Performance Optimization
19. Java Security Basics
20. Advanced Interview Topics

---

# 1️⃣ JVM Deep Dive

### JVM Components:
- Class Loader
- Runtime Data Areas
- Execution Engine
- Garbage Collector
- JIT Compiler

### Memory Areas:
- Heap
- Stack
- Method Area
- Program Counter
- Native Method Stack

---

# 2️⃣ Memory Management & Garbage Collection

Java automatically manages memory using **Garbage Collection (GC)**.

### GC Types:
- Serial GC
- Parallel GC
- G1 GC
- ZGC

### Example:

```java
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t = null; // Eligible for GC
    }
}
```

---

# 3️⃣ Multithreading & Concurrency

## Creating Threads

### Extending Thread

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Running");
    }
}
```

### Implementing Runnable

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread");
    }
}
```

---

# 4️⃣ Synchronization & Locks

```java
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

### Lock Interface

```java
import java.util.concurrent.locks.*;

Lock lock = new ReentrantLock();
lock.lock();
try {
    // critical section
} finally {
    lock.unlock();
}
```

---

# 5️⃣ Executor Framework

```java
import java.util.concurrent.*;

ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> System.out.println("Task executed"));
executor.shutdown();
```

---

# 6️⃣ Callable, Future & CompletableFuture

```java
Callable<Integer> task = () -> 10 + 20;

ExecutorService executor = Executors.newSingleThreadExecutor();
Future<Integer> result = executor.submit(task);

System.out.println(result.get());
executor.shutdown();
```

### CompletableFuture

```java
CompletableFuture.supplyAsync(() -> 10)
    .thenApply(num -> num * 2)
    .thenAccept(System.out::println);
```

---

# 7️⃣ Java Streams API (Advanced)

```java
List<Integer> nums = Arrays.asList(1,2,3,4,5);

nums.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * n)
    .forEach(System.out::println);
```

### Common Operations:
- filter()
- map()
- reduce()
- collect()
- sorted()

---

# 8️⃣ Functional Interfaces

```java
@FunctionalInterface
interface MyInterface {
    void display();
}
```

Built-in:
- Predicate
- Function
- Consumer
- Supplier

---

# 9️⃣ Reflection API

```java
Class<?> cls = Class.forName("Student");
Method[] methods = cls.getDeclaredMethods();
```

Used for:
- Framework development
- Dynamic object creation
- Annotations processing

---

# 🔟 Annotations

```java
@Override
public String toString() {
    return "Example";
}
```

Custom Annotation:

```java
@interface MyAnnotation {
    String value();
}
```

---

# 1️⃣1️⃣ Serialization

```java
import java.io.*;

class Student implements Serializable {
    String name;
}
```

---

# 1️⃣2️⃣ Java NIO

```java
import java.nio.file.*;

Path path = Paths.get("file.txt");
Files.write(path, "Hello".getBytes());
```

---

# 1️⃣3️⃣ Design Patterns

### Creational:
- Singleton
- Factory
- Builder

### Structural:
- Adapter
- Decorator

### Behavioral:
- Observer
- Strategy

Example: Singleton

```java
class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

# 1️⃣4️⃣ SOLID Principles

- S → Single Responsibility
- O → Open/Closed
- L → Liskov Substitution
- I → Interface Segregation
- D → Dependency Inversion

---

# 1️⃣5️⃣ JDBC

```java
import java.sql.*;

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/test",
    "root",
    "password"
);
```

Steps:
1. Load Driver
2. Create Connection
3. Create Statement
4. Execute Query
5. Close Connection

---

# 1️⃣6️⃣ Networking in Java

```java
import java.net.*;

Socket socket = new Socket("localhost", 8080);
```

Server Example:

```java
ServerSocket server = new ServerSocket(8080);
Socket client = server.accept();
```

---

# 1️⃣7️⃣ Java Modules (JPMS)

```java
module mymodule {
    exports com.example;
}
```

---

# 1️⃣8️⃣ Performance Optimization

- Use StringBuilder instead of String
- Use primitive types when possible
- Use appropriate collection types
- Enable JVM tuning flags

---

# 1️⃣9️⃣ Java Security Basics

- Cryptography API
- KeyStore
- Secure coding practices

---

# 2️⃣0️⃣ Advanced Interview Topics

- Deadlock & Starvation
- Race Conditions
- Memory Leaks
- Immutable Objects
- volatile keyword
- Double Checked Locking
- Thread Pool Internals

---

# ✅ Summary

✔ JVM Deep Understanding  
✔ Concurrency Mastery  
✔ Streams & Functional Programming  
✔ Reflection & Annotations  
✔ JDBC & Networking  
✔ Design Patterns & SOLID  

---

# 🚀 Next Steps

- Learn Spring Boot deeply
- Build REST APIs
- Work with Microservices
- Contribute to Open Source
- Practice System Design

---

**Master Java 🚀**