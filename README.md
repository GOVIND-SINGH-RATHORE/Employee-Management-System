# Employee Management System

Employee Management System is a Spring Boot application for managing employee data. It provides RESTful APIs to perform CRUD operations on employees stored in a database.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Lombok


## Features
- Create a new employee
- Retrieve all employees
- Update employee information
- Delete an employee by ID

## Getting Started

### Prerequisites
- Java 8 or higher

### Installation

1. Clone the repository:
  ```bash
  git clone https://github.com/your-username/EmpApplication.git
  ```

2. Navigate into the project directory:
  ```bash
  cd EmpApplication
  ```


3. Run the application:
  ```bash
  ./gradlew bootRun
  ```

The application will start running at ```http://localhost:8080```.

## Usage

Usage
Use tools like Postman or curl to interact with the RESTful APIs. Refer to the following endpoints:

- GET /employees: Retrieve all employees.
- POST /employees: Create a new employee.
- PUT /employees/{id}: Update an existing employee.
- DELETE /employees/{id}: Delete an employee by ID.

  
## Example Requests
```http
POST /employees
Content-Type: application/json

{
    "name": "John Doe",
    "age": 30,
    "emailId": "john.doe@example.com"
}
```


## Retrieve All Employees
```http
GET /employees
```

## Update Employee
```http
PUT /employees/{id}
Content-Type: application/json

{
    "name": "Updated Name",
    "age": 32,
    "emailId": "updated.email@example.com"
}
```

## Delete Employee
```http
DELETE /employees/{id}
```

## Contributing

For any questions or support, please reach out to [Govind Singh](mailto:govindsinghrathore1997@gmail.com).

---

Thank you for your interest in the Employee Management System! I hope this project inspires You to technology. Happy coding guys.

---
