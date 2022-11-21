//4. Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean
//distance from the point (x, y) to the origin (0, 0).
//The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        System.out.print("Enter the value of y: ");
        double y = input.nextDouble();
        double dist = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}