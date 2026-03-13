package com.nachiket.EmployeeRelationManagment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employess")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 30)
    private String name;

    @Column(unique = true, nullable = false, length = 30)
    private String email;

    @Column(nullable = false)
    private Double salary;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "d_id")
    private Department department;

    public Employee() {
    }

    public Employee(String name, Integer id, String email, Double salary, Department department) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
