package com.emp.empapplication;

import java.util.List;


//Service Layer
public interface EmpService
{
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id,Employee employee);
}
