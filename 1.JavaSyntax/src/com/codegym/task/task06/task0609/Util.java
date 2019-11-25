package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
    double a = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static void main(String[] args) {
        Util.getDistance(1,4,5,1);
    }
}
