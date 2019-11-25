package com.codegym.task.task06.task0614;


import java.util.ArrayList;

/* 
Static cats
1. Add the public static ArrayList<Cat> variable cats to the Cat class.
2. The variable cats must be initialized.
3. The main method should create 10 Cat objects (use the Cat() constructor).
4. The main method must add all the created cats to the variable cats.
5. The printCats method should display all the cat objects in the variable cats. Each on a new line.
*/

public class Cat {
    //write your code here
    public  static  ArrayList<Cat> cats = new ArrayList<>() ;
    public Cat() {
    }

    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < 10 ; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //write your code here
        for(Cat cat :cats )
        System.out.println(cats);
    }
}
