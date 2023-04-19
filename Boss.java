package com.MockSpring.Employee;

public class Boss {

    //Name, Yoe Age, salary , rating

    private String name;

    private int age;

    private float yoe;

    private float salary;

    private float rating;

    public Boss() {
    }

    public Boss(String name, int age, float yoe, float salary, float rating) {
        this.name = name;
        this.age = age;
        this.yoe = yoe;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getYoe() {
        return yoe;
    }

    public void setYoe(float yoe) {
        this.yoe = yoe;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
