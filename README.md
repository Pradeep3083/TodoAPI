# 📝 To-Do List API

A simple and clean RESTful API for managing tasks, built using **Spring Boot** and backed by a **relational database** (e.g., MySQL/H2).  
This project demonstrates fundamental **CRUD** operations (Create, Read, Update, Delete) for To-Do items.

---

## 🚀 Features

- ✅ **Create To-Do:** Add new tasks to your list.
- 📋 **Get All To-Dos:** Retrieve all available tasks.
- 🔍 **Get To-Do by ID:** Fetch a specific task using its unique identifier.
- ✏️ **Update To-Do:** Modify existing tasks (e.g., change description, mark as completed).
- 🗑️ **Delete To-Do:** Remove tasks from the list.

---

## 🛠️ Technologies Used

- **Java 17+**
- **Spring Boot** – Rapid application development with embedded Tomcat
- **Spring Data JPA** – Simplified data access using repositories
- **Hibernate** – JPA implementation for ORM (Object Relational Mapping)
- **Maven** – Dependency management and build tool

---

## 🔗 API Endpoints

**Base URL:** `http://localhost:8080/api/todos`

| Method | Endpoint     | Description                   |
|--------|--------------|-------------------------------|
| POST   | `/add`       | Create a new To-Do item       |
| GET    | `/all`       | Get all To-Do items           |
| GET    | `/{id}`      | Get a specific To-Do by ID    |
| PUT    | `/{id}`      | Update a To-Do by ID          |
| DELETE | `/{id}`      | Delete a To-Do by ID          |

---


