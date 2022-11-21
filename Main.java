//Programs With While Loop
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, i = 1;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        while(i <= x){
                sum = sum +i;
                i++;
            }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    }
}