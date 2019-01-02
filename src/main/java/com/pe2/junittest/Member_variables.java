package com.pe2.junittest;

public class Member_variables {
    Member obj;
    public Member_variables(){
        obj = new Member();
    }
    public String memberName(String name) {
        obj.Name = name;
        return obj.Name;
    }
    public int memberAge(int age) {
        obj.Age = age;
        return obj.Age;
    }
    public long memberSalary(long salary) {
        obj.Salary = salary;
        return obj.Salary;
    }
}
