package com.pe2.junittest;

public class Member {
    private String Name;
    private int Age;
    private long Salary;

    public String getName(){
        return Name;
    }

    public int getAge(){
        return Age;
    }

    public long getSalary(){
        return Salary;
    }

    public void setName( String newName){
        Name = newName;
    }

    public void setAge(int newAge){
        Age = newAge;
    }

    public void setSalary(long newSalary){
        Salary = newSalary;
    }
}