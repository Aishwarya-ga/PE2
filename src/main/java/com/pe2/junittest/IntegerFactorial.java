package com.pe2.junittest;

public class IntegerFactorial {
    public String getFactorial(int number) {
        String string="";
        int fact=1;
        for (int i=1;i<=number;i++) {
            fact = fact * i;
            string=string+"The factorial of " + i + " is " + fact + "\n";
        }
        return string;
    }
}
