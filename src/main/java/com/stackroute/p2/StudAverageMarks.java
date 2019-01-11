/**
 *Write a program, which reads number of students and
 * n grades as input (of int between 0 and 100, inclusive) and
 * displays the average, minimum and maximum.
 * Your program shall check for valid input.
 * You should keep all the grades in an int[] and
 * use a method for each of the computations.
 */
package com.stackroute.p2;

public class StudAverageMarks {

    /*Method to find the minimum grade*/
   public int StudentMin(int n,int array[]) {
       int minimum = array[0];
       for (int i=1;i<n;i++) {
           if (array[i]<minimum) {
               minimum = array[i];
           }
       }
       return minimum;
   }

    /*Method to find the maximum grade*/
   public int StudentMax(int n, int array[]) {
       int maximum = array[0];
       for (int i=0;i<n;i++) {
           if (array[i] > maximum) {
               maximum = array[i];
           }
       }
       return maximum;
   }

    /*Method to find the average grade*/
   public String StudentAvg(int n, int array[]) {
       double average;
       double sum = 0;
       for (int i=0;i<n;i++) {
           sum = sum + (double)array[i];
       }
       average = (double) (sum / n);
       return (Double.toString(average));
   }
}
