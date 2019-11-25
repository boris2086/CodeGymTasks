package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int count = 0;
        int countn=0;
        if (a == 0 && b == 0 && c == 0){
            count=0;
            countn=0;
            System.out.println("Number of negative numbers: " + countn);
            System.out.println("Number of positive numbers: " + count);

        }
        if (a > 0){
            count = count + 1;
        }
        if (b > 0){
            count = count + 1;
        }
        if (c > 0){
            count = count + 1;
        }
        System.out.println("Number of negative numbers: " + countn);
        System.out.println("Number of positive numbers: " + count);



        if ((a<0 && b<0 && c>0) || (a<0 && b>0 && c<0) || (a>0 && b<0 && c>0)){
            System.out.println("Number of negative numbers: 1");
            System.out.println("Number of positive numbers: 2 ");
        }
    }
}


