# 📝 To-Do List API

A simple RESTful **To-Do List API** built using **Spring Boot**, **Java 17**, and **Spring Data JPA**.  
This project supports basic CRUD operations for managing tasks (To-Do items) and persists data using a relational database (MySQL).

---

## 🚀 Features

- ✅ **Create To-Do:** Add new tasks to your list.
- 📋 **Get All To-Do's:** Retrieve all available tasks.
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
- **Relational Database** (MySQL)

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

## 🙋 Author

**Pradeep Sai Lakshman Guniganti**  
📫 [LinkedIn](https://www.linkedin.com/in/pradeep-sai-lakshman-guniganti-53181826a?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BFcmNjMFtR%2F%2BKBIaixJBtwQ%3D%3D)  
💻 [GitHub](https://github.com/Pradeep3083)


