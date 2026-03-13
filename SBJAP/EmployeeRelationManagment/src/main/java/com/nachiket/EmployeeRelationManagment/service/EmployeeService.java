package com.nachiket.EmployeeRelationManagment.service;

import com.nachiket.EmployeeRelationManagment.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Integer id, Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);


}
