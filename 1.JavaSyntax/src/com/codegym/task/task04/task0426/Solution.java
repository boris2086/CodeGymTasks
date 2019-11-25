package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 ==0 && num < 0){
            System.out.println("Negative even number");
        }else if (num % 2 ==-1&& num<0){
            System.out.println("Negative odd number");
        }
        if (num % 2 == 0 && num>0){
            System.out.println("Positive even number");
        }else if (num%2==1 && num>0){
            System.out.println("Positive odd number");
        }else if (num==0){
            System.out.println("Zero");

        }
    }
}
