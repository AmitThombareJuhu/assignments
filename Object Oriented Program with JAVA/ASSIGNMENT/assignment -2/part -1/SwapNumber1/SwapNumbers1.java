/* Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or - .
Hint : Use bitwise XOR ^ operator.*/

import java.util.Scanner;

class SwapNumbers1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        
        a = a ^ b; 
        b = a ^ b; 
        a = a ^ b; 

        
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        sc.close();
    }
}
/* o/p = Enter first number: 5
Enter second number: 10
After swapping:
First number: 10
Second number: 5