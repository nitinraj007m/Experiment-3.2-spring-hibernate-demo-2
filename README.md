# Experiment 3.2 — Spring + Hibernate Integration Project

## 📘 Overview
This project demonstrates how to build Java applications using **Spring Framework** and **Hibernate ORM** for:
- Dependency Injection (DI)
- CRUD Operations
- Transaction Management (extendable)

It’s divided into two main parts:

---

### ⚙️ Part A — Spring Dependency Injection (Java-Based Configuration)

**Objective:**  
Demonstrate how Spring performs **Dependency Injection (DI)** using Java annotations instead of XML.

**Key Files:**
- `Course.java` — A simple bean representing a course.
- `Student.java` — Depends on `Course`, injected via constructor.
- `AppConfig.java` — Contains `@Configuration` and `@Bean` definitions.
- `MainApp.java` — Runs the application and retrieves beans from the Spring container.

**Expected Output:**
