package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int sc =scanner.nextInt();

        if (sc >0){
            sc = sc * 2;
            System.out.println(sc);
        }else if (sc<0){
            sc = sc +1;
            System.out.println(sc);
        }else if (sc==0){
            System.out.println(0);
        }

    }

}