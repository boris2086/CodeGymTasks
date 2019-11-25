package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name)
    {
        this.name = name;
        this.weight=10;
        this.age=5;
        this.color="red";
    }
    public Cat(String name,int weight,int age)
    {
        this.name = name;
        this.weight=weight;
        this.age=age;
        this.color="Blue";
    }
    public Cat(String name,int age)
    {
        this.name = name;
        this.weight=6;
        this.age=age;
        this.color="Blue";
    }

    public Cat(int weight,String color)
    {
        this.weight=weight;
        this.age=5;
        this.color=color;
    }
    public Cat(int weight,String color,String address)
    {
        this.weight=weight;
        this.age=5;
        this.color=color;
        this.address=address;
    }

    public static void main(String[] args) {

    }
}
