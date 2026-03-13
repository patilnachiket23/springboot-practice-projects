package com.nachiket.EmployeeRelationManagment.service;

import com.nachiket.EmployeeRelationManagment.entity.Department;
import com.nachiket.EmployeeRelationManagment.entity.Employee;
import com.nachiket.EmployeeRelationManagment.exception.ResourceNotFoundException;
import com.nachiket.EmployeeRelationManagment.repository.DepartmentRepo;
import com.nachiket.EmployeeRelationManagment.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Employee saveEmployee(Integer id, Employee employee) {
        Department department = departmentRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Department not found"));

        employee.setDepartment(department);
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not found with id : "+id));
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = employeeRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not found with id : "+id));

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());

        if(employee.getDepartment()!=null && employee.getDepartment().getId()!=null){
            Department department = departmentRepo.findById(id)
                    .orElseThrow(()-> new ResourceNotFoundException("Department not found"));

            existingEmployee.setDepartment(department);
        }
        return employeeRepo.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee existingEmployee = employeeRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not found with id : "+id));
        employeeRepo.delete(existingEmployee);
    }
}
