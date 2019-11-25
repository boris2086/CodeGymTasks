package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        double mean = 0;
        double sum = 0;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            count++;
            String temp = reader.readLine();
            double number = Double.parseDouble(temp);
            if (number != -1) {
                sum =sum+ number;
            } else {
                sum =(sum+ number)+1;
                count=count-1;
                break;
            }
        }
        mean=sum/count;
        System.out.println(mean);
    }
  }


