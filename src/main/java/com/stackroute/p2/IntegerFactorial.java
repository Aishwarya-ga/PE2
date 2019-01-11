/**
 *Program to list all the factorials
 */
package com.stackroute.p2;

public class IntegerFactorial {

    /*Method to perform factorial*/
    public String getFactorial(int number) {
        String string="";
        int fact=1;

        //Calculating factorial and assigns the result to a string
        for (int i=1;i<=number;i++) {
            fact = fact * i;
            string=string+"The factorial of " + i + " is " + fact + "\n";
        }
        return string;
    }
}
