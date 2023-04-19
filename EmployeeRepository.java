package com.MockSpring.Employee;

import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class EmployeeRepository {
    HashMap<Integer,Employee> employeeHashMap=new HashMap<>();
    HashMap<Integer,Boss> bossHashMap=new HashMap<>();

    public void addEmployee(Employee employee) {

        employeeHashMap.put(employee.getRating(),employee);
    }

    public void addBoss(Boss boss) {

        bossHashMap.put(Integer.valueOf(boss.getName()),boss);
    }


    public List<Employee> getEmployee(int age, float rating) {
        List<Employee>  employeeList=new ArrayList<>();
        for(Employee employee:employeeHashMap.values()){
            if(employee.getAge()<age  && employee.getRating()>rating){
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    //Update : update all the boss salary of the boses, by x whose rating is > y. (path variables) 0.75 API

    public void updateBossSalary(float rating, int x) {

        List<Boss> bossList=new ArrayList<>();
        for(Boss boss:bossHashMap.values()) {
            if (boss.getRating() > x) {
                boss.setSalary(boss.getSalary() + x);
            }

            bossHashMap.put(Integer.valueOf(boss.getName()), boss);
        }
    }


    public int countEmployee(int x) {
        int emploeeCount=0;
        for(Employee employee:employeeHashMap.values()){
            float rating=employee.getRating();
            int boss=employee.getBoss();
            if(employee.getRating()>x && boss.getRating()>x){
                emploeeCount++;
            }
        }
        return emploeeCount;
    }
}
