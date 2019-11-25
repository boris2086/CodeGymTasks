package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int num= reader.read();
      int even = 0;
      int odd = 0;
      while (num!=0){
        int n = num%10;
        if (n%2==0){
          even++;
        }
        if (n%2 !=0){
          odd++;
          n = n/10;
          System.out.println( "Even: " + even + " Odd: " + odd);
        }
      }


    }
}
