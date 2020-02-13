package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
      //  System.out.println(list);

        ArrayList<String> result = doubleValues(list);

        // Display result
        for (int i=0;i<=result.size()-1;i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> s = new ArrayList<String>();
        for(int i=0;i<list.size();i++){
            //temp=;
            s.add(list.get(i));
            s.add(list.get(i));
        }

        return s;
    }
}
