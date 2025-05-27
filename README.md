# 🎓 Student Management API - Spring Boot Project

This project is a **RESTful API** for managing student records built using **Spring Boot**. It allows for full CRUD operations (Create, Read, Update, Delete) on student data and is integrated with a relational database like **MySQL** or **H2**. All endpoints are tested using **Postman**.

---

## 📁 Project Structure

```
src/
├── controller/
│   └── StudentManagementController.java
├── model/
│   └── Student.java
├── repository/
│   └── StudentRepository.java
├── service/
│   └── StudentService.java
```

---

## 💡 Features

- Add new student records
- Retrieve all students or by ID
- Update existing student information
- Delete students from the database
- RESTful APIs using Spring Boot
- Integration with MySQL or H2
- Postman-tested endpoints

---

## 🖥️ Technologies Used

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- MySQL / H2 Database  
- Postman for API testing

---
## Base Path `/api/students`
## 🔌 API Endpoints

| Method | Endpoint           | Description               |
|--------|--------------------|---------------------------|
| POST   | `/add`        | Add a new student         |
| GET    | `/get`        | Get all students          |
| GET    | `/get/{id}`   | Get student by ID         |
| PUT    | `/insert/{id}`   | Update student by ID      |
| DELETE | `/delete/{id}`   | Delete student by ID      |

---

## 📦 Database Configuration

### Option 1: MySQL (in `application.properties`)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Option 2: H2 In-Memory DB
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📬 Sample JSON for POST/PUT

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "course": "Java Backend"
}
```

---

## 🧪 Postman Testing

> Screenshots below show sample responses from Postman.

| Action        | Screenshot |
|---------------|------------|
| POST /students (Add) | ![POST](https://github.com/user-attachments/assets/f08cd723-3564-4125-b5e0-30f9729b657c) |
| GET /students | ![GET](https://github.com/user-attachments/assets/1fd7b96f-3c73-4678-b164-4c3e07e9d480) |
| PUT /students/{id} | ![PUT](https://github.com/user-attachments/assets/c89a87c7-acb9-4b4c-857b-02bf5da7cc1e) |
| DELETE /students/{id} | ![DELETE](https://github.com/user-attachments/assets/19658333-8dd9-4ae4-8be6-e03e82f7e171) |

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/student-management-api.git
   ```
2. Navigate to the project folder and run:
   ```bash
   mvn spring-boot:run
   ```

3. Use Postman to test the APIs locally at:
   ```
   http://localhost:8080/api/students
   ```

---

## 📄 License

This project is intended for learning and educational purposes only.  
No commercial use is permitted.

---

Made with ☕ and 🧠 by **Nitish Saini**
