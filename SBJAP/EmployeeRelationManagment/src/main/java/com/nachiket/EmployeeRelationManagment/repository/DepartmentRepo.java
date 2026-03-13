package com.nachiket.EmployeeRelationManagment.repository;

import com.nachiket.EmployeeRelationManagment.entity.Department;
import com.nachiket.EmployeeRelationManagment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
