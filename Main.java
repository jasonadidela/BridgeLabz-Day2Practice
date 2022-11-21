//If Else Statement Problems
//2. Read a Number 1,10,100,1000 and display unit, ten hundred

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int b=n1%10,a=n2/10;
        String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
        String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
        if(a==1){
            System.out.println(two_digits[b+1]);
        }
        else if(b==0)
            System.out.println(tens_multiple[a]);
        else
            System.out.println(tens_multiple[a]+"-"+single_digits[b]);
    }
}