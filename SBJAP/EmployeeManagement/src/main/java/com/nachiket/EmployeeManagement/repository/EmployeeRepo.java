package com.nachiket.EmployeeManagement.repository;

import com.nachiket.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
