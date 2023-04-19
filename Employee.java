package com.MockSpring.Employee;

public class Employee {
    //Rating, age, yoe

private  String name;
    private float rating;

    private int age;
private
    private float yoe;

    public Employee() {
    }

    public Employee(float rating, int age, float yoe) {
        this.rating = rating;
        this.age = age;
        this.yoe = yoe;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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
}
