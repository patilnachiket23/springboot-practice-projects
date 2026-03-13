package com.nachiket.EmployeeRelationManagment.repository;

import com.nachiket.EmployeeRelationManagment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
