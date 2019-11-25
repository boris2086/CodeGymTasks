package com.codegym.task.task06.task0613;

/* 
Cat and statics
1. In the Cat class, create a static public int variable catCount.
2. In the Cat class, declare the public Cat() constructor with no parameters.
3. The constructor must increment the value of the static variable catCount by 1.
4. In the main method, create 10 cats.
5. In the main method, after creating all the cats, display the value of the variable catCount.
*/

public class Solution {
    public static void main(String[] args) {
        // Create 10 cats
        for (int i = 0; i < 10 ; i++) {
            Cat cat = new Cat();
        }
        // Display the value of the variable catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Create a static variable catCount
        static public int catCount = 0;

        // Declare a constructor
        public Cat(){
            catCount++;
            
        }
        
    }
}
