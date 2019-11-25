package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    String name = null;
    int age;
    int weight;
    String address=null;
    String color;

    public void initialize(String name)
    {
        this.name = name;
        this.age=21;
        this.weight=33;
        this.color="red";

    }

    public void initialize(String name,int weight,int age)
    {
        this.name = name;
        this.age=age;
        this.weight=weight;
        this.color="blue";
    }
    public void initialize(String name,int age)
    {
        this.name = name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    public void initialize(int weight,String color)
    {
        this.age=25;
        this.weight=weight;
        this.color=color;
    }
    public void initialize(int weight,String color,String address)
    {
        this.age=24;
        this.weight=weight;
        this.address=address;
        this.color=color;
    }


    public static void main(String[] args) {

    }
}
