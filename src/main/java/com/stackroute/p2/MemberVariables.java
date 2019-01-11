/**
 * Member Variable that creates an instance of the Member class,
 * initialises its member variables, and
 * then displays the value of each member variable.
 */
package com.stackroute.p2;

public class MemberVariables {
    Member obj;

    /*Default Constructor*/
    public MemberVariables(){
        obj = new Member();
    }

    /*Method assigns name to private variable in Member class and returns the same*/
    public String memberName(String name) {
        obj.setName(name);
        return obj.getName();
    }

    /*Method assigns age to private variable in Member class and returns the same*/
    public int memberAge(int age) {
        obj.setAge(age);
        return obj.getAge();
    }

    /*Method assigns salary to private variable in Member class and returns the same*/
    public long memberSalary(long salary) {
        obj.setSalary(salary);
        return obj.getSalary();
    }
}
