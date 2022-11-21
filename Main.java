//Programs With For Loop
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter The number:");
        int in = n.nextInt();
        int i, sum = 0;
        for(i = 1; i <= in; ++i){
                sum = sum + i;
            }
            System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}