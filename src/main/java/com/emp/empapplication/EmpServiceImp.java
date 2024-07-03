package com.emp.empapplication;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Service Layer Implementation

@Service
public class EmpServiceImp implements EmpService{

    @Autowired // Repository Injection
    private EmpRepository empRepository;    //

    List<Employee> employees =new ArrayList<>();

    @Override
    public String createEmployee(Employee employee){
        EmpEntity empEntity=new EmpEntity();
        BeanUtils.copyProperties(employee,empEntity);  //
        empRepository.save(empEntity);//
        // employees.add(employee);
    return "Employee Saved";
    }


    @Override
    public List<Employee> readEmployees(){
        List<EmpEntity> empEntityList=empRepository.findAll();     //
        List<Employee> employeeList=new ArrayList<>(); //

        for(EmpEntity empEntity:empEntityList){

            Employee employee=new Employee();

            employee.setId(empEntity.getId());
            employee.setName(empEntity.getName());
            employee.setAge(empEntity.getAge());
            employee.setEmailId(empEntity.getEmailId());

            employeeList.add(employee);

            //or
           // BeanUtils.copyProperties(empEntity,employee);
        }

    return employeeList;   //
    }


    @Override
    public boolean deleteEmployee(Long id){
        EmpEntity emp;
        emp = empRepository.findById(id).get();
        empRepository.delete(emp);
        return true;

//        for(Employee e : employees)
//        {
//            if(e.getId().equals(id))
//            { employees.remove(e);
//            return true;
//            }
//        }
 //       return false;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmpEntity empEntity=empRepository.findById(id).get();

        empEntity.setEmailId(employee.getEmailId());
        empEntity.setAge(employee.getAge());
        empEntity.setName(employee.getName());

        empRepository.save(empEntity);
        return "Updated Successfully";
    }


}
