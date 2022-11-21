//Programs With While Loop
//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter The number:");
        int number = n.nextInt();
        int reverse = 0;
        while(number != 0){
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}