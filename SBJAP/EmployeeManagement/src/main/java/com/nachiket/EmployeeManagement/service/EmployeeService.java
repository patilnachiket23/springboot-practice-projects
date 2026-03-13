package com.nachiket.EmployeeManagement.service;

import com.nachiket.EmployeeManagement.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);


}
