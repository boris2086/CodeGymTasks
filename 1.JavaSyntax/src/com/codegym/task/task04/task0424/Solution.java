package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int n1= scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1==n2) {
            System.out.println(3);
        }else if (n2==n3){
            System.out.println(1);
        }else if (n3==n1){
            System.out.println(2);

        }
    }
}
