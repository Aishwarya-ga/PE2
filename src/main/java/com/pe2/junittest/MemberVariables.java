package com.pe2.junittest;

public class MemberVariables {
    Member obj;
    public MemberVariables(){
        obj = new Member();
    }
    public String memberName(String name) {
        obj.setName(name);
        return obj.getName();
    }
    public int memberAge(int age) {
        obj.setAge(age);
        return obj.getAge();
    }
    public long memberSalary(long salary) {
        obj.setSalary(salary);
        return obj.getSalary();
    }
}
