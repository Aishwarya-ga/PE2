package com.pe2.junittest;

public class StudAverageMarks {

   public int StudentMin(int n,int array[]) {
       int minimum = array[0];
       for (int i=1;i<n;i++) {
           if (array[i]<minimum) {
               minimum = array[i];
           }
       }
       return minimum;
   }

   public int StudentMax(int n, int array[]) {
       int maximum = array[0];
       for (int i=0;i<n;i++) {
           if (array[i] > maximum) {
               maximum = array[i];
           }
       }
       return maximum;
   }

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
