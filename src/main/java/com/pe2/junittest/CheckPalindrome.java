package com.pe2.junittest;

public class CheckPalindrome {
    public String checkPalindrome(String string){
        String reverse = "";
        int length;
        length = string.length();
        /*String reversal code
         */

        for(int i=length-1;i>=0;i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }
}
