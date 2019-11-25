package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int tree = sc.nextInt();

        if (one > two && two > tree){
                System.out.print(one + " " + two + " " + tree);
        }else if (one > tree && tree > one){
            System.out.println(tree + " " + two + " " +one);
        }else if (two > one && one > tree){
            System.out.println(one + " " + tree + " " + two);
        }else if (two > tree && tree > one){
            System.out.println();
        }else if (tree > two && two > tree){
            System.out.println();
        }else if (tree > one && one > two){
            System.out.println();
        }

    }
}
