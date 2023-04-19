package com.MockSpring.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired

    EmployeeService  employeeService;

    //ADD EMPLOYEE
    @PostMapping("/add_employee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "employee Added";
    }

    @PostMapping("/add_boss")
    public String addBoss(@RequestBody Boss boss){
        employeeService.addBoss(boss);
        return "Boss Added";
    }

    //Get   employees who are under a given age and have rating greater than x. (request parameters) 0.75

    @GetMapping("/get_employee")
    public List<Employee> getEmployee(@RequestParam("age") int age, @RequestParam("rating") float rating){
     return   employeeService.getEmployee(age,rating);
    }

    //Update : update all the boss salary of the boses, by x whose rating is > y. (path variables) 0.75 API
    @PutMapping("/update")
    public Void updateBossSalary(float rating,int x){
        employeeService.updateBossSalary(rating,x);

    }

    //Find out all count of the employees, who’s bossRating and employee rating > x.
    @GetMapping("/count_employee")
    public int countEmployee(int x){
        return    employeeService.countEmployee(x);
    }
}
