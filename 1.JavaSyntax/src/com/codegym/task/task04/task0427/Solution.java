package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import com.sun.org.apache.xerces.internal.impl.xs.SchemaGrammar;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num%2==0 && num<10 && num>0 && num<1000){
            System.out.println("even single-digit number");
        }else if (num%2==1 && num<10){
            System.out.println("odd single-digit number");
        }else if (num%2==0 && num<100){
            System.out.println("even two-digit number");
        }else if (num%2==1 && num<100){
            System.out.println("odd two-digit number");
        }else if (num%2==0 && num<100){
            System.out.println("even three-digit number");
        }else if (num%2==1 && num<100){
            System.out.println("odd three-digit number");
        }
    }
}
