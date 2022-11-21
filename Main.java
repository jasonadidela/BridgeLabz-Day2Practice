//Programs With For Loop
//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter The number:");
        int number = n.nextInt();
        int reverse = 0;
        for( ;number != 0; number=number/10){
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println("The reverse of the given number is: " + reverse);
    }
}