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
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(reader.readLine());
		}
		for(int i=0; i<=list.size()-1; i++){
			int strSizea=list.get(i).length();
			int strSizeb=list.get(i+1).length();
			if(strSizea > strSizeb)
				System.out.println(i-1);
		}

	}
}


