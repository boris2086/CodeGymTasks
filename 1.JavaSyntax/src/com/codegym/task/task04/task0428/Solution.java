package com.codegym.task.task04.task0428;

/* 
Positive number

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

    if (a < 0 && b < 0 && c < 0){
      count=0;
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
    System.out.println(count);

  }
}