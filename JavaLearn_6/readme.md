
---

## 📌 Project Overview

This project demonstrates **ALL Java Operators** in a single file using **all primitive data types**.

It is designed for:
- 📘 Beginners learning Java fundamentals
- 🎯 Students preparing for interviews
- 🔁 Developers revising Core Java
- 🏫 Academic assignment submission

The project is structured in a clean and professional way for learning and revision purposes.

---

# 📂 Project Structure

```
Java-Operators-Complete-Demo/
│
├── OperatorsCompleteDemo.java
└── README.md
```

---
---

# 🛠 Technologies Used

- Java (JDK 8 or above)
- VS Code / IntelliJ IDEA / Eclipse
- Command Line Interface (CLI)

---

# 📘 Complete Topics Covered

---

## 1️⃣ Primitive Data Types Used

- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

---

# 🔢 Java Operators Explained

---

## 2️⃣ Arithmetic Operators

Used for mathematical calculations.

| Operator | Description |
|----------|------------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus (Remainder) |

Example:
```java
int a = 10, b = 5;
System.out.println(a + b);
```

---

## 3️⃣ Unary Operators

Operate on a single operand.

| Operator | Description |
|----------|------------|
| ++ | Increment |
| -- | Decrement |
| + | Unary Plus |
| - | Unary Minus |
| ! | Logical NOT |

Pre vs Post Example:
```java
int x = 5;
System.out.println(x++); // Post
System.out.println(++x); // Pre
```

---

## 4️⃣ Assignment Operators

Used to assign and modify values.

| Operator | Example |
|----------|----------|
| = | a = 10 |
| += | a += 5 |
| -= | a -= 5 |
| *= | a *= 5 |
| /= | a /= 5 |
| %= | a %= 5 |

---

## 5️⃣ Relational Operators

Used to compare values.

| Operator | Meaning |
|----------|----------|
| == | Equal to |
| != | Not equal |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal |
| <= | Less than or equal |

Returns: `boolean`

---

## 6️⃣ Logical Operators

Work with boolean values.

| Operator | Meaning |
|----------|----------|
| && | Logical AND |
| || | Logical OR |
| ! | Logical NOT |

---

## 7️⃣ Bitwise Operators

Operate on binary values.

| Operator | Meaning |
|----------|----------|
| & | AND |
| | | OR |
| ^ | XOR |
| ~ | Complement |

Example:
```
5  -> 0101
3  -> 0011
AND -> 0001
```

---

## 8️⃣ Shift Operators

Used to shift bits left or right.

| Operator | Meaning |
|----------|----------|
| << | Left Shift |
| >> | Right Shift |
| >>> | Unsigned Right Shift |

---

## 9️⃣ Ternary Operator

Short form of if-else.

```java
condition ? value_if_true : value_if_false;
```

Example:
```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
```

---

## 🔟 Type Casting

### 🔹 Implicit Casting (Widening)
Small → Large data type

```java
int a = 10;
double b = a;
```

### 🔹 Explicit Casting (Narrowing)
Large → Small data type

```java
double d = 10.5;
int i = (int) d;
```

---

## 1️⃣1️⃣ instanceof Operator

Checks object type at runtime.

```java
obj instanceof ClassName
```

Returns: `true` or `false`

---

# ▶️ How To Run

## 🔹 Using Command Line

```
javac OperatorsCompleteDemo.java
java OperatorsCompleteDemo
```

## 🔹 Using IDE

1. Open project
2. Click Run
3. View console output

---

# 📊 Sample Output

```
===== ARITHMETIC OPERATORS =====
Addition: 50
Subtraction: 10

===== LOGICAL OPERATORS =====
&& : false
|| : true

===== TERNARY OPERATOR =====
Adult
```

---

# 🎯 Learning Outcomes

After completing this project, you will understand:

- Difference between logical and bitwise operators
- How pre/post increment works internally
- Signed vs unsigned shift
- How type casting affects data
- Operator precedence basics
- Real usage examples of all operators

---

# 🧠 Interview Preparation Section

### Common Interview Questions

1. Difference between `==` and `.equals()`?
2. Difference between `&&` and `&`?
3. What is the difference between `>>` and `>>>`?
4. Explain Pre-increment vs Post-increment.
5. What is type promotion in Java?

---

# 📝 Assignment Version

### Practice Tasks

1. Write a program to swap two numbers using operators.
2. Check if a number is even or odd using ternary operator.
3. Demonstrate all assignment operators.
4. Show bitwise operations in binary format.
5. Create examples for implicit and explicit casting.

---

# 🚀 Future Improvements

- Add operator precedence examples
- Add Wrapper class operator examples
- Add user input version using Scanner
- Add advanced tricky output-based questions

---

# 👩‍💻 Author

Educational Java Project  
Created for learning and academic purposes.

---

# 📜 License

This project is for educational use only.

---

⭐ If this project helped you, consider starring your repository!
