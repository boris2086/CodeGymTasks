package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

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
        int four = sc.nextInt();
        if (one>=two && one>=tree && one>=four){
            System.out.println(one);
        }else if (two>=one && two>=tree&& two>=four){
            System.out.println(two);
        }else if (tree>=one && tree>=two && tree>=four){
            System.out.println(tree);
        }else if (four>=one&&four>=two&&four>=tree){
            System.out.println(four);
        }else if(one == two && two == tree && tree == four) {
            System.out.println(one);
            System.out.println(two);
            System.out.println(tree);
            System.out.println(four);
        }
    }
}
