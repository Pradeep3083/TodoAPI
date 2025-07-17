# To-Do List API
A simple RESTful API for managing your tasks, built with Spring Boot and backend by a databse. This project demostrates fundamental CRUD (CREATE, READ, UPDATE, DELETE) operations for To-Do items

# Features
**Create To-Do:** Add new tasks to your list.
**Get All To-Dos:** Retrieve all available tasks.
**Get To-Do by ID:** Fetch a specific task using its unique identifier
**Update To-Do:** Modify existing tasks (e.g., change description, mark as completed).
**Delete To-Do:** Remove tasks from the list.

# Technologies Used
Java 17+
Spring Boot: Framework for building the API.
Spring Data JPA: For easy databse interaction.
Hibernate: JPA implementation
Maven: Dependency management and build tool

# API Endpoints
The API base URL is (http://localhost:8080/api/todos).

(POST) -> (/add) -> create a To-Do item
(GET) -> (/all) -> Get all To-Do items
(GET) -> (/{id}) -> Get a To-Do item by ID
(PUT) -> (/{id}) -> Update an existing To-Do item
(DELETE) -> (/{id}) -> Delete a To-Do item by ID
