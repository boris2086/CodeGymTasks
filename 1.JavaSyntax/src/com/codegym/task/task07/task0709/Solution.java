package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> strings = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        max = strings.get(0).length();
        for (int i = 1; i < 10; i++) {

            if (strings.get(i).length() > max){ max = strings.get(i).length();
            }
        }
        for(int i = 0; i < 5; i++){
            if(max == strings.get(i).length()){System.out.println(strings.get(i));
            }
    }
}
}
