/*Implement a Java program that returns the absolute value of a given number using
the ternary operator (without using Math.abs() ).*/

import java.util.Scanner;

class AbsoluteValueTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        int absoluteValue = (num < 0) ? -num : num;

        
        System.out.println("The absolute value is: " + absoluteValue);

        sc.close(); 
    }
}
/* o/p = Enter a number: -15
The absolute value is: 15
Enter a number: 20
The absolute value is: 20