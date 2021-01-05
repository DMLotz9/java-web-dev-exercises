package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        double pi;
        double radius;
        Scanner input;

        pi = 3.14;

        input = new Scanner (System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");

    }
}
