//Programs With For Loop
//3. Write a Program to find Palindrome Number
//e.g. Input n=121 then after reverse output is same 121 then it is a palindrome.
//e.g. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter The number:");
        int r,sum=0,temp;
        int n=num.nextInt();
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
            }
            if(temp==sum)
                System.out.println( "The Give Number is a palindrome :" + temp);
            else
                System.out.println( "The Give Number is not a palindrome :" + temp);
    }
}