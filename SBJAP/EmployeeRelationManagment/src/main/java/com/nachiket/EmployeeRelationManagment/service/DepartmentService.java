package com.nachiket.EmployeeRelationManagment.service;

import com.nachiket.EmployeeRelationManagment.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> getAllDepartment();
    Department getDepartmentById(Integer id);
}
