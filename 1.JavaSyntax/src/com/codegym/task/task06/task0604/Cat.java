package com.codegym.task.task06.task0604;

/* 
Cat counter

*/

public class Cat {
    public static int catCount = 0;

    //write your code here
    public Cat(){
        Cat.catCount+=1;
    }

    protected void finalize() throws Throwable{
        Cat.catCount--;
    }


    public static void main(String[] args) {

    }
}