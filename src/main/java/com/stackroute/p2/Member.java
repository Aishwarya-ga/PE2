/**
 * A member class contains the private variables and their getters and setters.
 */
package com.stackroute.p2;

public class Member {

    private String Name;
    private int Age;
    private long Salary;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }
}
