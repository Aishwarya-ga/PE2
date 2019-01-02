package com.pe2.junittest;

public class ToCheckPowerOf4 {
    public boolean powerOf4(int number){
        int flag=1;
        if(number == 0)
            flag = 0;
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
