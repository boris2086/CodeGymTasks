package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        t =t%5;
        if (t>=0 && t<3){
            System.out.println("green");
        }else if (t>=3 && t<4){
            System.out.println("yellow");

        }else {
            System.out.println("red");
        }
    }
}