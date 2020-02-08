package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        for (Iterator<String> i = list.iterator() ; i.hasNext();) {
            String str = i.next();
            boolean isR = str.contains("r");
            boolean isL = str.contains("l");
            if (isR ^ isL){
                if (isR){
                    i.remove();
                }
                else {
                    list.add(str);
                    list.add(str);
                }
            }
            else {
                list.add(str);
            }
        }
        return list;
    }
}