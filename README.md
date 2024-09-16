

#EmpApplication

EmpApplication is a Spring Boot application for managing employee data. It provides RESTful APIs to perform CRUD operations on employees stored in a database.

Technologies Used
Java
Spring Boot
Spring Data JPA
Lombok

Features
Create a new employee
Retrieve all employees
Update employee information
Delete an employee by ID

Getting Started

Prerequisites
Java 8 or higher

Maven
Installation

Clone the repository:

bash
Copy code
git clone https://github.com/your-username/EmpApplication.git
Navigate into the project directory:

bash
Copy code
cd EmpApplication
Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
The application will start running at http://localhost:8080.

Usage
Use tools like Postman or curl to interact with the RESTful APIs.
Refer to the following endpoints:
GET /employees: Retrieve all employees.
POST /employees: Create a new employee.
PUT /employees/{id}: Update an existing employee.
DELETE /employees/{id}: Delete an employee by ID.
Example Requests
Create Employee
http
Copy code
POST /employees
Content-Type: application/json

{
  "name": "John Doe",
  "age": 30,
  "emailId": "john.doe@example.com"
}
Retrieve All Employees
http
Copy code
GET /employees
Update Employee
http
Copy code
PUT /employees/{id}
Content-Type: application/json

{
  "name": "Updated Name",
  "age": 32,
  "emailId": "updated.email@example.com"
}
Delete Employee
http
Copy code
DELETE /employees/{id}


Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
