package com.MockSpring.Employee;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    EmployeeRepository  employeeRepository;
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public void addBoss(Boss boss) {
        employeeRepository.addBoss(boss);
    }

    public List<Employee> getEmployee(int age, float rating) {
        return employeeRepository.getEmployee(age,rating);
    }

    public void updateBossSalary(float rating, int x) {
        employeeRepository.updateBossSalary(rating,x);
    }

    public int countEmployee(int x) {
        return employeeRepository.countEmployee(x);
    }
}
