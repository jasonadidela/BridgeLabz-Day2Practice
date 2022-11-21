//1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the value a");
        int a = var1.nextInt();
        System.out.println("Enter the value b");
        int b = var1.nextInt();
        System.out.println("Enter the value c");
        int c = var1.nextInt();
        if (a > b){
            if (a > c){
                System.out.println("the max value is "+ a);
            }
        }
        if (b > a){
            if (b > c){
                System.out.println("the max value is "+ b);
            }
        }
        if (c > a){
            if (c > b){
                System.out.println("the max value is "+ c);
            }
        }
        if (a < b){
            if (a < c){
                System.out.println("the min value is "+ a);
            }
        }
        if (b < a){
            if (b < c){
                System.out.println("the min value is "+ b);
            }
        }
        if (c < a){
            if (c < b){
                System.out.println("the min value is "+ c);
            }
        }
        int s = a+b*c;
        float t = c+a/b;
        int u = a%b+c;
        int v = a*b+c;
        System.out.println("The value for the operation a+b*c :" + s);
        System.out.println("The value for the operation c+a/b :" + t);
        System.out.println("The value for the operation a%b+c :" + u);
        System.out.println("The value for the operation a*b+c :" + v);
    }
}