package com.nachiket.EmployeeRelationManagment.service;

import com.nachiket.EmployeeRelationManagment.entity.Department;
import com.nachiket.EmployeeRelationManagment.exception.ResourceNotFoundException;
import com.nachiket.EmployeeRelationManagment.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentImpl implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Department not found with id : "+id));
    }
}
