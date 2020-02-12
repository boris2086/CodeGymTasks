package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i <list.size() ; i++) {
            int current = list.get(i).length();
            for (int j = i+1; j <list.size() ; j++) {
                int next = list.get(j).length();
                if (current > next){
                    System.out.println(i);
                    return;
                }
            }
        }


    }
}

