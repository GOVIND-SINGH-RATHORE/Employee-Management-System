package com.emp.empapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class EmpController {

    @Autowired
    EmpService employeeService; //=new EmpServiceImp();             // Maybe Bean is not creating  // 1:44:00

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
//        Employees emp=new Employees();
//        emp.setName("Govind Singh");
//        emp.setAge(28);
//        employees.add(null);
//        employees.add(emp);
        return employeeService.readEmployees();

    }


    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee_model)  //Employee Model
    {
//        employees.add(employee_model);

        return employeeService.createEmployee(employee_model);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        if (employeeService.deleteEmployee(id))
        {
            return "Deleted Successfully";
        }

        return "Not Found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id,@RequestBody Employee employee_model) {

    return  employeeService.updateEmployee(id, employee_model);

    }

}
