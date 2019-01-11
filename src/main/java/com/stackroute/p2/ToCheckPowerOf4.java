/**
 * To check if a given number is power of 4
 */
package com.stackroute.p2;

public class ToCheckPowerOf4 {

    /*Method to check the given number is a power of 4*/
    public boolean powerOf4(int number){
        int flag=1;
        if(number == 0)
            flag = 0;

        //Checking for the power of 4
        while(number != 1)
        {
            if(number % 4 != 0) {
                flag = 0;
                break;
            }
            number = number / 4;
        }
        if (flag==1) {
            return true;
        }
        else{
            return false;
        }
    }
}
