/**
 *Reverse the given input.
 */
package com.stackroute.p2;

public class CheckPalindrome {

    /*Method to reverse the string*/
    public String checkPalindrome(String string){
        String reverse = "";
        int length;
        length = string.length();

        //String reversal
        for(int i=length-1;i>=0;i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }
}
