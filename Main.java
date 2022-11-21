//If Else Statement Problems
//1. Read a single Digit Number and write in word

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cont=new Scanner(System.in);
        int a;
        System.out.println("Enter single digit number:");
        a = cont.nextInt();
        String[] array = {"zero","one", "two", "three","four","five","six","seven","eight","nine"};
        if(a < 10){
            System.out.println("You have entered number:"+array[a]);
        }else
            System.out.println("Not a single digit number");
    }
}